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
<li>MainToolbar - PageObject containing locators of items in MainToolbar</li>
<li>ConfirmationPopup - PageObject containing locators of yes and no button in confirmation popup</li>
<li>DocumentToolbar - Pageobject containing locators of items of DocumentToolbar</li>
<li>FileContextMenu - Pageobject containing locators of items in ContextMenu of a File</li>
<li>FileDropDown - Pageobject containing locators of exit in File Dropdown Menu of Maintoolbar</li>
<li>NavigateTabsTest</li>
<li>RememberMeLogin - tests whether Credentials are saved when clicking "Remember Me"</li>
<li>TestDownloadDocument - uses document toolbar to select download first file</li>
<li>TestGalleryDocument - uses document toolbar to open gallery document view</li>
<li>TestListDocument - uses document toolbar to open list document view</li>
<li>TestRefreshDocument - uses document toolbar to refresh document view(becomes useful with Selenium Grid)</li>
<li>Logout - logs an logged in user out. (depends on successful login)</li>
<li>SearchTest - uses search input to search for "hello" example</li>
<li>TestDownloadFile - uses context menu of first file to open download popup</li>
<li>TestPreviewFile - uses context menu of first file to open preview popup</li>
<li>TestCutFile - uses context menu of first file to select cut action</li>
<li>TestCopyFile - uses context menu of first file to select copy action</li>
<li>TestDeleteFile - uses context menu of first file to delete file from database</li>
<li>TestBookmarkFile - uses context menu of first file to bookmark file</li>
<li>TestSendEmailFile - uses context menu of first file to open Email popup and fills its form</li>
<li>TestCheckoutFile - uses context menu of first file to checkout file and check it in again</li>
<li>TestLockFile - uses context menu of first file to lock and unlock file</li>
<li>TestIndexFile - uses context menu of first file to index it</li>
<li>TestMarkIndexFile - uses context menu of first file to mark it unidexable and indexable again</li>
<li>TestImmutableFile - uses context menu of first file to make it immutable</li>
<li>TestSignFile - uses context menu of first file to sign it</li>

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

# TODOs

<ul>
<li>Jan: </li>
<ul>
<li>File actions </li>
<li>Document Toolbar actions</li>
</ul>
<li>Johannes</li>
<ul>
<li>Folder actions </li>
<li>Main Menu </li>
</ul>
</ul>
