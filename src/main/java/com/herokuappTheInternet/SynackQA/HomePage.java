/**
 *   File Name: HomePage.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 5, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * HomePage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private static String homePageUrl = "https://the-internet.herokuapp.com/";
	
	
	// ============================= page =============================	
	// titles / text
	private By welcomeTitle						= By.cssSelector("#content > h1");
	private By availableTitle					= By.cssSelector("#content > h2");
	
	// links for pages
	private By aBTestingLink					= By.cssSelector("#content > ul > li:nth-child(1) > a");
	private By basicAuthLink					= By.cssSelector("#content > ul > li:nth-child(2) > a");
	private By brokenImagesLink					= By.cssSelector("#content > ul > li:nth-child(3) > a");
	private By challengingDOMLink				= By.cssSelector("#content > ul > li:nth-child(4) > a");
	private By checkboxesLink					= By.cssSelector("#content > ul > li:nth-child(5) > a");
	private By contextMenuLink					= By.cssSelector("#content > ul > li:nth-child(6) > a");
	private By disappearingElementsLink			= By.cssSelector("#content > ul > li:nth-child(7) > a");
	private By dragAndDropLink					= By.cssSelector("#content > ul > li:nth-child(8) > a");
	private By dropdownLink						= By.cssSelector("#content > ul > li:nth-child(9) > a");
	private By dynamicContentLink				= By.cssSelector("#content > ul > li:nth-child(10) > a");
	private By dynamicControlsLink				= By.cssSelector("#content > ul > li:nth-child(11) > a");
	private By dynamicLoadingLink				= By.cssSelector("#content > ul > li:nth-child(12) > a");
	private By exitIntentLink					= By.cssSelector("#content > ul > li:nth-child(13) > a");
	private By fileDownloadLink					= By.cssSelector("#content > ul > li:nth-child(14) > a");
	private By fileUploadLink					= By.cssSelector("#content > ul > li:nth-child(15) > a");
	private By floatingMenuLink					= By.cssSelector("#content > ul > li:nth-child(16) > a");
	private By forgotPasswordLink				= By.cssSelector("#content > ul > li:nth-child(17) > a");
	private By formAuthenticationLink			= By.cssSelector("#content > ul > li:nth-child(18) > a");
	private By framesLink						= By.cssSelector("#content > ul > li:nth-child(19) > a");
	private By geolocationLink					= By.cssSelector("#content > ul > li:nth-child(20) > a");
	private By horizontalSliderLink				= By.cssSelector("#content > ul > li:nth-child(21) > a");
	private By hoversLink						= By.cssSelector("#content > ul > li:nth-child(22) > a");
	private By infiniteScrollLink				= By.cssSelector("#content > ul > li:nth-child(23) > a");
	private By jQueryUIMenusLink				= By.cssSelector("#content > ul > li:nth-child(24) > a");
	private By javaScriptAlertsLink				= By.cssSelector("#content > ul > li:nth-child(25) > a");
	private By javaScriptOnloadEventErrorLink	= By.cssSelector("#content > ul > li:nth-child(26) > a");
	private By keyPressesLink					= By.cssSelector("#content > ul > li:nth-child(27) > a");
	private By largeAndDeepDOMLink				= By.cssSelector("#content > ul > li:nth-child(28) > a");
	private By multipleWindowsLink				= By.cssSelector("#content > ul > li:nth-child(29) > a");
	private By nestedFramesLink					= By.cssSelector("#content > ul > li:nth-child(30) > a");
	private By notificationMessagesLink			= By.cssSelector("#content > ul > li:nth-child(31) > a");
	private By redirectLinkLink					= By.cssSelector("#content > ul > li:nth-child(32) > a");
	private By secureFileDownloadLink			= By.cssSelector("#content > ul > li:nth-child(33) > a");
	private By shiftingContentLink				= By.cssSelector("#content > ul > li:nth-child(34) > a");
	private By slowResourcesLink				= By.cssSelector("#content > ul > li:nth-child(35) > a");
	private By sortableDataTablesLink			= By.cssSelector("#content > ul > li:nth-child(36) > a");
	private By statusCodesLink					= By.cssSelector("#content > ul > li:nth-child(37) > a");
	private By typosLink						= By.cssSelector("#content > ul > li:nth-child(38) > a");
	private By wYSIWYGEditorLink				= By.cssSelector("#content > ul > li:nth-child(39) > a");
			
	public HomePage navigateToHomePage() {
		driver.navigate().to(homePageUrl);
		return new HomePage(driver);
	}
	
	public ABTestingPage navigateToABTestingPage() {
		we = driver.findElement(aBTestingLink);
		we.click();
		return new ABTestingPage(driver);
	}

	public BasicAuthPage navigateToBasicAuthPage() {
		we = driver.findElement(basicAuthLink);
		we.click();
		return new BasicAuthPage(driver);
	}
	
	public BrokenImagesPage navigateToBrokenImagesPage() {
		we = driver.findElement(brokenImagesLink);
		we.click();
		return new BrokenImagesPage(driver);
	}
	
	public ChallengingDOMPage navigateToChallengingDOMPage() {
		we = driver.findElement(challengingDOMLink);
		we.click();
		return new ChallengingDOMPage(driver);
	}

	public CheckboxesPage navigateToCheckboxesPage() {
		we = driver.findElement(checkboxesLink);
		we.click();
		return new CheckboxesPage(driver);
	}
	
	public ContextMenuPage navigateToContextMenuPage() {
		we = driver.findElement(contextMenuLink);
		we.click();
		return new ContextMenuPage(driver);
	}
	
	public DisappearingElementsPage navigateToDisappearingElementsPage() {
		we = driver.findElement(disappearingElementsLink);
		we.click();
		return new DisappearingElementsPage(driver);
	}

	public DragAndDropPage navigateToDragAndDropPage() {
		we = driver.findElement(dragAndDropLink);
		we.click();
		return new DragAndDropPage(driver);
	}
	
	public DropdownPage navigateToDropdownPage() {
		we = driver.findElement(dropdownLink);
		we.click();
		return new DropdownPage(driver);
	}
	
	public DynamicContentPage navigateToDynamicContentPage() {
		we = driver.findElement(dynamicContentLink);
		we.click();
		return new DynamicContentPage(driver);
	}

	public DynamicControlsPage navigateToDynamicControlsPage() {
		we = driver.findElement(dynamicControlsLink);
		we.click();
		return new DynamicControlsPage(driver);
	}
	
	public DynamicLoadingPage navigateToDynamicLoadingPage() {
		we = driver.findElement(dynamicLoadingLink);
		we.click();
		return new DynamicLoadingPage(driver);
	}
	
	public ExitIntentPage navigateToExitIntentPage() {
		we = driver.findElement(exitIntentLink);
		we.click();
		return new ExitIntentPage(driver);
	}

	public FileDownloadPage navigateToFileDownloadPage() {
		we = driver.findElement(fileDownloadLink);
		we.click();
		return new FileDownloadPage(driver);
	}
	
	public FileUploadPage navigateToFileUploadPage() {
		we = driver.findElement(fileUploadLink);
		we.click();
		return new FileUploadPage(driver);
	}
	
	public LoatingMenuPage navigateToLoatingMenuPage() {
		we = driver.findElement(loatingMenuLink);
		we.click();
		return new LoatingMenuPage(driver);
	}

	public ForgotPasswordPage navigateToForgotPasswordPage() {
		we = driver.findElement(forgotPasswordLink);
		we.click();
		return new ForgotPasswordPage(driver);
	}
	
	public FormAuthenticationPage navigateToFormAuthenticationPage() {
		we = driver.findElement(formAuthenticationLink);
		we.click();
		return new FormAuthenticationPage(driver);
	}
	
	public FramesPage navigateToFramesPage() {
		we = driver.findElement(framesLink);
		we.click();
		return new FramesPage(driver);
	}

	public GeolocationPage navigateToGeolocationPage() {
		we = driver.findElement(geolocationLink);
		we.click();
		return new GeolocationPage(driver);
	}
	
	public HorizontalSliderPage navigateToHorizontalSliderPage() {
		we = driver.findElement(horizontalSliderLink);
		we.click();
		return new HorizontalSliderPage(driver);
	}
	
	public HoversPage navigateToHoversPage() {
		we = driver.findElement(hoversLink);
		we.click();
		return new HoversPage(driver);
	}

	public InfiniteScrollPage navigateToInfiniteScrollPage() {
		we = driver.findElement(infiniteScrollLink);
		we.click();
		return new InfiniteScrollPage(driver);
	}
	
	public JQueryUIMenusPage navigateToJQueryUIMenusPage() {
		we = driver.findElement(jQueryUIMenusLink);
		we.click();
		return new JQueryUIMenusPage(driver);
	}
	
	public JavaScriptAlertsPage navigateToJavaScriptAlertsPage() {
		we = driver.findElement(javaScriptAlertsLink);
		we.click();
		return new JavaScriptAlertsPage(driver);
	}

	public JavaScriptOnloadEventErrorPage navigateToJavaScriptOnloadEventErrorPage() {
		we = driver.findElement(javaScriptOnloadEventErrorLink);
		we.click();
		return new JavaScriptOnloadEventErrorPage(driver);
	}
	
	public KeyPressesPage navigateToKeyPressesPage() {
		we = driver.findElement(keyPressesLink);
		we.click();
		return new KeyPressesPage(driver);
	}
	
	public LargeAndDeepDOMPage navigateToLargeAndDeepDOMPage() {
		we = driver.findElement(largeAndDeepDOMLink);
		we.click();
		return new LargeAndDeepDOMPage(driver);
	}

	public MultipleWindowsPage navigateToMultipleWindowsPage() {
		we = driver.findElement(multipleWindowsLink);
		we.click();
		return new MultipleWindowsPage(driver);
	}
	
	public NestedFramesPage navigateToNestedFramesPage() {
		we = driver.findElement(nestedFramesLink);
		we.click();
		return new NestedFramesPage(driver);
	}
	
	public NotificationMessagesPage navigateToNotificationMessagesPage() {
		we = driver.findElement(notificationMessagesLink);
		we.click();
		return new NotificationMessagesPage(driver);
	}

	public RedirectLinkPage navigateToRedirectLinkPage() {
		we = driver.findElement(redirectLinkLink);
		we.click();
		return new RedirectLinkPage(driver);
	}
	
	public SecureFileDownloadPage navigateToSecureFileDownloadPage() {
		we = driver.findElement(secureFileDownloadLink);
		we.click();
		return new SecureFileDownloadPage(driver);
	}
	
	public ShiftingContentPage navigateToShiftingContentPage() {
		we = driver.findElement(shiftingContentLink);
		we.click();
		return new ShiftingContentPage(driver);
	}

	public SlowResourcesPage navigateToSlowResourcesPage() {
		we = driver.findElement(slowResourcesLink);
		we.click();
		return new SlowResourcesPage(driver);
	}
	
	public SortableDataTablesPage navigateToSortableDataTablesPage() {
		we = driver.findElement(sortableDataTablesLink);
		we.click();
		return new SortableDataTablesPage(driver);
	}

	public StatusCodesPage navigateToStatusCodesPage() {
		we = driver.findElement(statusCodesLink);
		we.click();
		return new StatusCodesPage(driver);
	}

	public TyposPage navigateToTyposPage() {
		we = driver.findElement(typosLink);
		we.click();
		return new TyposPage(driver);
	}
	
	public WYSIWYGEditorPage navigateToWYSIWYGEditorPage() {
		we = driver.findElement(wYSIWYGEditorLink);
		we.click();
		return new WYSIWYGEditorPage(driver);
	}

	


	
}
