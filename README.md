# OrderedArrayList

NoNullArrayList Discussion:
  We discussed how we have to check that all of the members that we add to the SuperArray cannot be null. If it is null, we will throw a illegal argument exception. We also discussed how we would need to modify the add and set methods to fit our purposes.

  A misconception we had was whether we were examining the things that we were adding to the ArrayList were null or if we were examining if we had nulls in the SuperArray list already.

OrderedArrayList Discussion:
  Use a for loop and compareTo() to find where the input should be placed. then use super.add method to insert the input at the proper index.

  A misconception we had was that we thought that we had to deal with an existing array and sort that first before we would start checking the inputs that we wanted to put into the ArrayList.

  Another method that we thought of was maybe using greater than or less than but realized that it wouldn't work for objects that weren't numerical.
