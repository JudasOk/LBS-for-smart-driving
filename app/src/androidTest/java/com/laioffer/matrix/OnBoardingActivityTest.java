package com.laioffer.matrix;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.rule.GrantPermissionRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class OnBoardingActivityTest {

    @Rule
    public ActivityTestRule<OnBoardingActivity> mActivityTestRule = new ActivityTestRule<>(OnBoardingActivity.class);

    @Rule
    public GrantPermissionRule mGrantPermissionRule =
            GrantPermissionRule.grant(
                    "android.permission.ACCESS_FINE_LOCATION");

    @Test
    public void onBoardingActivityTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editTextLogin),
                        childAtPosition(
                                allOf(withId(R.id.loginLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editTextLogin),
                        childAtPosition(
                                allOf(withId(R.id.loginLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("tim"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.editTextPassword),
                        childAtPosition(
                                allOf(withId(R.id.loginLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.editTextPassword), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.loginLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatEditText4.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.editTextPassword), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.loginLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatEditText5.perform(replaceText("123"));

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.editTextPassword), withText("123"),
                        childAtPosition(
                                allOf(withId(R.id.loginLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatEditText6.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.editTextPassword), withText("123"),
                        childAtPosition(
                                allOf(withId(R.id.loginLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatEditText7.perform(pressImeActionButton());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.submit), withText("Login"),
                        childAtPosition(
                                allOf(withId(R.id.loginLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                4),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        0),
                                1),
                        isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction linearLayout = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.recycler_view),
                                childAtPosition(
                                        withId(R.id.event_type_layout_id),
                                        1)),
                        8),
                        isDisplayed()));
        linearLayout.perform(click());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.event_comment),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.event_spec_layout_id),
                                        2),
                                2),
                        isDisplayed()));
        appCompatEditText8.perform(click());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.event_comment),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.event_spec_layout_id),
                                        2),
                                2),
                        isDisplayed()));
        appCompatEditText9.perform(click());

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.event_comment),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.event_spec_layout_id),
                                        2),
                                2),
                        isDisplayed()));
        appCompatEditText10.perform(replaceText("it's slippery\n\n"), closeSoftKeyboard());

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.event_comment), withText("it's slippery\n\n"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.event_spec_layout_id),
                                        2),
                                2),
                        isDisplayed()));
        appCompatEditText11.perform(click());

        pressBack();

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.event_send_button), withText("Send"),
                        childAtPosition(
                                allOf(withId(R.id.event_send),
                                        childAtPosition(
                                                withId(R.id.event_spec_layout_id),
                                                3)),
                                2),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.event_back_button), withText("Back"),
                        childAtPosition(
                                allOf(withId(R.id.event_send),
                                        childAtPosition(
                                                withId(R.id.event_spec_layout_id),
                                                3)),
                                0),
                        isDisplayed()));
        appCompatButton3.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
