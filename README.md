12 hour clock confusing way to show the time especially when am/pm is not displayed (especially for Swedish users which is supposed to be the main target group for a program like this)

Does not always follow code convention. Eg long lines and periodically missing comments

Non-thread-safe methods in swing are called from a thread other than edt in dateAndTime. Corresponding to the initial SwingWorker

Non-thread-safe methods in swing are called from a thread other than edt, for example when StartMenu is created in main (but also in more methods called from there). Thread safety issues

The user does not receive a notification that something went wrong during the update if this were to happen (things just stop working). Poor exception handling

return expression; is equivalent to "if(expression) { return true;} else {return false;}" but easier to read and less prone to errors. See e.g. checkTheTime

programLoader is used from several threads without thread safety (e.g. in case of simultaneous updates that are not prevented due to other thread safety problems, etc.)

naming does not always facilitate readability. Corresponding to comments which are sometimes quite confusing

For G fix anyway: Write report, Fix thread security problems (there may be more than what I described above as I did not have the help of a report)
