### Identify Car Wash Services
 
## Detailed Description:
- Open the url<br>
- Select service type as "car" and select subcategory as "SUV" and click "Go for it"<br>
- Capture all service name and amount<br>
- Click on register and capture the error message by providing invalid input for email field<br>
- Navigate to home page and click on "Our Centers"<br>
- Select state with city and click on search to capture the center name.[use 3 combinations of state and city]<br>
- (Suggested Site: https://www.doorstepwash.com/ )<br>

## Key Automation Scope:
 
- Handling dropdown<br>
- Navigating back to home page.<br>
- Filling form <br>
- Capture warning message.<br>
- Data Driven approach.<br>

##Tools with its version:
 
- maven	:	3.13.0
- selenium		:	4.15.0
- testng		: 	7.5
- apache.poi	:	5.2.3	
- 
 
## JAR FILES:
`<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>HackathonProject</groupId>
	<artifactId>HackathonProject</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<build>
		<pluginManagement>
			<plugins>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-compiler-plugin</artifactId>
					<version>3.13.0</version>
					<configuration>
						<!-- put your configurations here -->
					</configuration>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-surefire-plugin</artifactId>
					<version>3.2.5</version>
					<configuration>
						<suiteXmlFiles>
							<suiteXmlFile>master.xml</suiteXmlFile>
						</suiteXmlFiles>
					</configuration>
				</plugin>
			</plugins>
		</pluginManagement>
	</build>


	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.15.0</version>
		</dependency>
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.7.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>5.2.3</version>
		</dependency>


		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>5.2.3</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
		<dependency>
			<groupId>com.aventstack</groupId>
			<artifactId>extentreports</artifactId>
			<version>5.1.1</version>
		</dependency>


		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.5</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
</project>`
 

 

## OUTPUT:(chrome)

[Snow Wash, 399.00, Snow Wash + Polish, 599.00, Detailing, 1699.00, Headlight Restoration, 199.00, Wiper Fluid Refill, 149.00]<br>

Please enter a valid Email Address.<br>
[Jammu and Kashmir - Udhampur - Shakti Nagar, Udhampur | 8055008805]<br>
[Jammu and Kashmir - Udhampur - Shakti Nagar, Udhampur | 8055008805, New Delhi - Rohini - Sector 11, Rohini | 8055008805, New Delhi - Rohini - Sector 17, Rohini | 8055008805]<br>
[Jammu and Kashmir - Udhampur - Shakti Nagar, Udhampur | 8055008805, New Delhi - Rohini - Sector 11, Rohini | 8055008805, New Delhi - Rohini - Sector 17, Rohini | 8055008805, Goa - Margoa - Near Chowgule Collage, Margoa | 8055008805]<br>

===============================================<br>
Suite<br>
Total tests run: 4, Passes: 4, Failures: 0, Skips: 0<br>
===============================================<br>
 
