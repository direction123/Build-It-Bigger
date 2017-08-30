package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by fangxiangwang on 8/28/17.
 */


@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void testInBackground(){
        String result = null;

        try {
            MainActivityFragment mainActivityFragment = new MainActivityFragment();
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mainActivityFragment, null);
            endpointsAsyncTask.testMode = true;
            endpointsAsyncTask.execute();
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(result);
        assertTrue(result.length() > 0);
    }
}
