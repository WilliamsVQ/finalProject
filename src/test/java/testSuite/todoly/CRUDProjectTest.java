package testSuite.todoly;

import org.junit.jupiter.api.Test;

public class CRUDProjectTest extends TestBase{

    @Test
    public void verifyCRUDProject() throws InterruptedException {
        String projectCreated="Bootcamp";

        mainPage.loginLabel.click();
        loginSection.emailTxtBox.setText(user);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();
        projectSection.addNewProjecButton.click();
        projectSection.nameProjectTxtBox.setText(projectCreated);
        projectSection.addButton.click();
        Thread.sleep(3000);
        projectSection.menuProject.click();
        projectSection.deleteProject.click();
        projectSection.confirmDelete.click();
        Thread.sleep(3000);
    }


}
