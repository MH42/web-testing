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


* AddDocument - logs in and adds a new Document by uploading the intro.pdf
* DeleteDocument - logs in and deletes the document on top of the list
* LanguageTest - tests, whether the right language is displayed when using ?locale=ID identifier in URL TODO: could be parameterized
* LoginPage - PageObject, that enables loginAs(user,password)
* LoginTest - Tests login with "admin" and "noadmin" TODO: could be parameterized
* MainToolbar - PageObject containing locators of items in MainToolbar
* ConfirmationPopup - PageObject containing locators of yes and no button in confirmation popup
* DocumentToolbar - Pageobject containing locators of items of DocumentToolbar
* FileContextMenu - Pageobject containing locators of items in ContextMenu of a File
* FileDropDown - Pageobject containing locators of exit in File Dropdown Menu of Maintoolbar
* NavigateTabsTest
* RememberMeLogin - tests whether Credentials are saved when clicking "Remember Me"
* TestDownloadDocument - uses document toolbar to select download first file
* TestGalleryDocument - uses document toolbar to open gallery document view
* TestListDocument - uses document toolbar to open list document view
* TestRefreshDocument - uses document toolbar to refresh document view(becomes useful with Selenium Grid)
* Logout - logs an logged in user out. (depends on successful login)
* SearchTest - uses search input to search for "hello" example
* TestDownloadFile - uses context menu of first file to open download popup
* TestPreviewFile - uses context menu of first file to open preview popup
* TestCutFile - uses context menu of first file to select cut action
* TestCopyFile - uses context menu of first file to select copy action
* TestDeleteFile - uses context menu of first file to delete file from database
* TestBookmarkFile - uses context menu of first file to bookmark file
* TestSendEmailFile - uses context menu of first file to open Email popup and fills its form
* TestCheckoutFile - uses context menu of first file to checkout file and check it in again
* TestLockFile - uses context menu of first file to lock and unlock file
* TestIndexFile - uses context menu of first file to index it
* TestMarkIndexFile - uses context menu of first file to mark it unidexable and indexable again
* TestImmutableFile - uses context menu of first file to make it immutable
* TestSignFile - uses context menu of first file to sign it




# ideas for tests

caption:

:+1: := Test exists and runs without errors (pray to the mighty xpath for his goodwill)

* := Test exists, but needs to be fixed

:warning: := To be created

* folder actions

  * :+1: New folder
  * :warning: Rename folder
  * Delete folder
  * Add bookmark
  * :warning: Move folder
  * :warning: Copy and Paste folder
  * :warning: Copy and Paste folder as alias
  * Export to ZIP

* file actions

  * Download
  * Preview
  * Cut
  * Copy
  * Delete
  * Add as bookmark
  * Send by email
  * Checkout
  * :warning: Checkin
  * Lock
  * :warning: Unlock
  * :warning: Change file's language
  * :warning: tag file
  * :warning: Vote file
  * :warning: check different versions
  * More

    * Index
    * Mark indexable
    * Mark unindexable
    * :warning: Make immutable
    * :warning: Sign


* personal settings

  * :warning: Profile
  * Change password (and relogin)
  * Signature
  * Private Key
  * Contacts

    * :warning: Add Contact
    * :warning: Import Contacts from file

  * Remove Cookies


* tools

  * :warning: Dropbox import
  * :warning: Dropbox export
  * :warning: Change Registration

* Help

  * :exclamation: Open Documentation
  * :exclamation: Report a bug
  * :exclamation: Open Forum
  * :+1: Open and close Credentials

* search files/folders


# TODOs


* Jan:

* File actions
* Document Toolbar actions

* Johannes

* Folder actions
