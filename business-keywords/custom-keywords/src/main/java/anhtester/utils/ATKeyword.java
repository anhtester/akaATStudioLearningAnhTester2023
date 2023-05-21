package anhtester.utils;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v97.network.Network;
import org.openqa.selenium.devtools.v97.network.model.Headers;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.fpt.ivs.at.core.utilities.WebDriverUtilities;
import com.google.common.util.concurrent.Uninterruptibles;

import java.time.Duration;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class ATKeyword {

	public void handleAuthentication() {
		RemoteWebDriver driver = WebDriverUtilities.getDriver();

		// Authentication username & password
		String url = "https://the-internet.herokuapp.com/basic_auth";
		String username = "admin";
		String password = "admin";

		// Get the devtools from the running driver and create a session
		DevTools devTools = ((HasDevTools) driver).getDevTools();
		devTools.createSession();

		// Enable the Network domain of devtools
		devTools.send(Network.enable(
				Optional.of(100000),
				Optional.of(100000),
				Optional.of(100000)));
		String auth = username + ":" + password;

		// Encoding the username and password using Base64 (java.util)
		String encodeToString = Base64.getEncoder().encodeToString(auth.getBytes());

		// Pass the network header -> Authorization : Basic <encoded String>
		Map<String, Object> headers = new HashMap<>();
		headers.put("Authorization", "Basic " + encodeToString);
		devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));

		// Load the application url
		driver.get(url);
		Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));

		String successFullyLoggedInText = driver.findElement(By.xpath("//p")).getText();
		
		System.out.println(successFullyLoggedInText);
	}

}