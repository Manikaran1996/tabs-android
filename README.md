# tabs-android
The repository contains android project to add tabs to the activity.
In order to add tabs you have to include design library dependency to the gradle.build file-
				
				implementation 'com.android.support:design:27.1.1'

Add the above line to dependencies in gradle.build file.
In this project, I have used view pager along with TabLayout to implement swiping tabs. I have used FragmentPagerAdapter, you can also use FragmentStatePagerAdapter.

FragmentPagerAdapter - This is best when navigating between sibling screens representing a fixed, small number of pages.

FragmentStatePagerAdapter - This is best for paging across a collection of objects for which the number of pages is undetermined. It destroys fragments as the user navigates to other pages, minimizing memory usage. 

# Reference-
https://developer.android.com/training/implementing-navigation/lateral
