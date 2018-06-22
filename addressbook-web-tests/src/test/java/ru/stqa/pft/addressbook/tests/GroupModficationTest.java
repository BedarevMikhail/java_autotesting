package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModficationTest extends TestBase {


  @Test
  public void testGroupModification() {
    app.getNavigationHelper().goToGroupPage();

    if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("11 hero", "second", "third"));
    }

    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "changing2", "changing3"));
    app.getGroupHelper().submitModification();
    app.getGroupHelper().returnToGroupPage();
  }


}
