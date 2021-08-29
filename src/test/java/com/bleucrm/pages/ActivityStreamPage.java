package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.By;

public class ActivityStreamPage extends BasePage{



    public void clickOnTab(String tabName){
        String tabID = "//*[@id='feed-add-post-blockblogPostForm']//*[.='"+tabName+"'][1]";
        Driver.get().findElement(By.id(tabID)).click();
    }
}
