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
  * :+1: Add bookmark
  * :warning: Move folder
  * :warning: Copy and Paste folder
  * :warning: Copy and Paste folder as alias
  * Export to ZIP

* file actions

  * :+1: Download
  * :+1: Preview
  * :+1: Cut
  * :+1: Copy
  * :+1: Delete
  * :+1: Add as bookmark
  * Send by email
  * Checkout
  * Checkin
  * Lock
  * Unlock
  * :+1: Change file's language
  * tag file
  * :+1: Vote file
  * :warning: check different versions
  * More

    * :+1: Index
    * Mark indexable
    * Mark unindexable
    * Make immutable
    * Sign


* personal settings


  * :+1: Profile
  * :+1: Change password
  * Signature
  * :+1: Private Key
  * :+1: Contacts

    * Add Contact
    * Import Contacts from file

  * Remove Cookies


* tools

  * Dropbox import
  * Dropbox export
  * :+1: Change Registration

* Help

  * Open Documentation
  * Report a bug
  * Open Forum
  * :+1: Open and close Credentials

* search files/folders
* :+1: Login
* :+1: Logout
* :+1: Language Test


# TODOs


* Jan:

* File actions
* Document Toolbar actions

* Johannes

* Folder actions
