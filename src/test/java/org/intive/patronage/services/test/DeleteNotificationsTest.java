package org.intive.patronage.services.test;

import org.intive.patronage.services.test.models.common.TestData;
import org.json.JSONException;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import java.io.IOException;

public class DeleteNotificationsTest extends TestBase {

    @DataProvider(name = "testData")
    public static Object[] provideTestData(final ITestContext context) {
        return provideTestData(DeleteNotificationsTest.class, context);
    }

    @Factory(dataProvider = "testData")
    public DeleteNotificationsTest(final TestData testData) {
        setTestClassObject(testData);
    }

    @Test()
    public void deleteNotificationsTest() throws IOException, JSONException {
        logTestNameToReporter();
        performTest();
    }

}
