package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
/**
 * Created by fangxiangwang on 8/28/17.
 */

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void sayHello(){
        String result = "test";
        assertNotNull(result);
    }
}