# test-dir
This directory is intended to be used as the folder on the Eclipse build path containing all the Selenium tests.
The directory structure should look like this:

```
Eclipse-Project
+-- src
|   +-- main
|       +-- java
|           +-- <packages>
|               +-- <Java files>
+-- src
|   +-- seleniumtest
|       +-- java
|           +-- <packages>
|               +-- <Selenium Tests>
+--  README.md
```

# file overview

<ul>
<li>AddDocument - logs in and adds a new Document by uploading the intro.pdf </li>
<li>DeleteDocument - logs in and deletes the document on top of the list </li>
<li>LanguageTest - tests, whether the right language is displayed when using ?locale=ID identifier in URL TODO: could be parameterized</li>
<li>LoginPage - PageObject, that enables loginAs(user,password)</li>
<li>LoginTest - Tests login with "admin" and "noadmin" TODO: could be parameterized</li>
<li>MainPage </li>
<li>NavigateTabsTest</li>
<li>RememberMeLogin - tests whether Credentials are saved when clicking "Remember Me"</li>
<li>Search - uses search mask to search for "example" file</li>
<li>Logout - logs an logged in user out. (depends on successful login)</li>
<li>SearchTest - </li>
</ul>


# ideas for tests

<ul>
<li>folder actions</li>
  <ul>
  <li>New folder</li>
  <li>Rename folder (needs "New folder")</li>
  <li>Delete folder (needs "New folder")</li>
  <li>Add bookmark (needs "New folder")</li>
  <li>Move folder (needs "New folder")</li>
  <li>Copy and Paste folder (needs "New folder")</li>
  <li>Copy and Paste folder as alias (needs "New folder")</li>
  <li>Export to ZIP (needs "New folder")</li>
  </ul>
<li>file actions </li>
  <ul>
  <li>Download</li>
  <li>Preview </li>
  <li>Cut</li>
  <li>Copy </li>
  <li>Delete </li>
  <li>Add as bookmark </li>
  <li>Send by email </li>
  <li>Checkout </li>
  <li>Checkin </li>
  <li>Lock </li>
  <li>Unlock </li>
  <li>Change file's language</li>
  <li>tag file</li>
  <li>Vote file</li>
  <li>check different versions</li>
  <li>More</li>
    <ul>
    <li>Index</li>
    <li>Mark indexable </li>
    <li>Mark unindexable</li>
    <li>Make immutable </li>
    <li>Sign </li>
    </ul>
  </ul>
<li>personal settings </li>
  <ul>
  <li>Profile</li>
  <li>Change password (and relogin)</li>
  <li>Signature </li>
  <li>Private Key </li>
  <li>Contacts </li>
    <ul>
    <li>Add Contact</li>
    <li>Import Contacts from file</li>
    </ul>
  <li>Remove Cookies</li>

  </ul>
<li>tools</li>
  <ul>
  <li>Dropbox import</li>
  <li>Dropbox export</li>
  <li>Change Registration</li>
  </ul>
<li>Help</li>
  <ul>
  <li>Open Documentation</li>
  <li>Report a bug</li>
  <li>Open Forum</li>
  <li>Open and close Credentials</li>
  </ul>
<li>search files/folders</li>
</ul>
