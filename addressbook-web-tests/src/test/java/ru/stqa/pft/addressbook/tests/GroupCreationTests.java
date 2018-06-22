package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {
  @Test
  public void testGroupCreation() {
    app.getGroupHelper().returnToGroupPage();
    app.getGroupHelper().createGroup(new GroupData("112", "zoz", null));
  }


}

