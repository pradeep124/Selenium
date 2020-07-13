package org.travelodge.flows;

import org.openqa.selenium.interactions.Actions;
import org.travelodge.Basedriver.Basedriverclass;
import org.travelodge.pages.Page_login;

public class Flow_login extends Basedriverclass {

    public void login() throws InterruptedException {

        Page_login pl = new Page_login();

        Thread.sleep(2000);
        if (pl.getCookiepopup().isDisplayed()) {
            pl.getCookiepopup().click();
        } else {
            pl.getCookiepopup2().click();
        }
        Thread.sleep(2000);

        pl.getLogin().click();

        Thread.sleep(2000);

        Actions action = new Actions(driver);

        action.moveToElement(pl.getEmail()).click().sendKeys("pradeephnk@gmail.com").build().perform();

        Thread.sleep(2000);

        action.moveToElement(pl.getPassword()).click().sendKeys("Hansika2010").build().perform();

        Thread.sleep(3000);

        action.moveToElement(pl.getSubmit()).click().build().perform();

        Thread.sleep(2000);

    }

}
