package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase {
  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().goToGroupPage();
    if(!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("11 hero", "second", "third"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
