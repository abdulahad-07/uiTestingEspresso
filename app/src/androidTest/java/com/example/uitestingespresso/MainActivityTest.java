package com.example.uitestingespresso;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    
    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);
    
    @Test
    public void testLoginSuccess() {
        
        onView(withId(R.id.et_username)).perform(typeText("testuser"), closeSoftKeyboard());
        
        onView(withId(R.id.et_password)).perform(typeText("test123"), closeSoftKeyboard());
        
        onView(withId(R.id.btn_login)).perform(click());
        
        onView(withId(R.id.tv_welcome)).check(matches(isDisplayed()));
    }
    
}