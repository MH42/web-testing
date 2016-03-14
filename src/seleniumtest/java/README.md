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
## tests

* PageObjects
  * AddDocument - logs in and adds a new Document by uploading the intro.pdf
  * AddFolder - adds a new Folder with the name "New folder"
  * ConfirmationPopup - PageObject containing locators of yes and no button in confirmation popup
  * CreateUser - Creates a new user with given Credentials
  * DeleteDirectory
  * DeleteDocument - logs in and deletes the document on top of the list
  * DocumentToolbar - Pageobject containing locators of items of DocumentToolbar
  * FileContextMenu - Pageobject containing locators of items in ContextMenu of a File
  * FileDropDown - Pageobject containing locators of exit in File Dropdown Menu of Maintoolbar
  * HelpDropdown -
  * LockFile - uses context menu of first file to lock and unlock file
  * LoginPage - PageObject, that enables loginAs(user,password)
  * MainToolbar - PageObject containing locators of items in MainToolbar
  * OS - gets OS type for OS specific variables and commands
  * PersonalDropdown -
  * PropertiesLoader
  * RecoverLDState - sets LD state to a version backed-up  in a zip
  * Statusbar
  * SwitchTabs
  * ToolDropdown
  * UnzipUtility - unzips zips. Needed for RecoverLDState


* tests
  * AddDocumentTest - tests the AddDocument method
  * AddUserTest
  * DeleteDocumentTest
  * FileDropDownTest
  * LanguageTest - tests, whether the right language is displayed when using ?locale=ID identifier in URL
  * LanguageTestParameters - same as LanguageTest, tests 24 languages
  * LoginTest - Tests login with "admin" and "noadmin"
  * NavigateTabsTest
  * RememberMeLogin - tests whether Credentials are saved when clicking "Remember Me"
  * VerifyLogoTest - Verifies, whether the right logo is displayed
  * VerifyTitleTest - Verifies, whether the right title is displayed

* tests.DocumentToolbar
  * DownloadDocument - uses document toolbar to select download first file
  * GalleryDocument - uses document toolbar to open gallery document view
  * ListDocument - uses document toolbar to open list document view
  * RefreshDocument - uses document toolbar to refresh document view(becomes useful with Selenium Grid)

* tests.fileActions
  * BookmarkFile - uses context menu of first file to bookmark file
  * ChangeLanguageFileTest - uses file form to change its language to next language in options
  * CheckinFileTest - uses context menu checks a file in 
  * CheckoutFile - uses context menu of first file to checkout file and check it in again
  * CopyFile - uses context menu of first file to select copy action
  * CutFile - uses context menu of first file to select cut action
  * DeleteFile - uses context menu of first file to delete file from database
  * DownloadFile - uses context menu of first file to open download popup
  * EmailFileTest - uses context menu of first file to open Email popup and fills its form
  * FilterTest - Filters filelist
  * ImmutableFile - uses context menu of first file to make it immutable
  * IndexFile - uses context menu of first file to index it
  * LinkFileTest - uses context
  * LockFileTest - uses contextmenu to lock file
  * MarkIndexableFile - uses context menu of first file to mark it unidexable and indexable again
  * MarkUnindexableFile
  * PreviewFile - uses context menu of first file to open preview popup
  * PrintDocumentTest
  * SignFile - uses context menu of first file to sign it
  * TagFileTest
  * UnlockFileTest -
  * VoteFileTest - Votes a file

* tests.Folder
  * AddBookmarkTest
  * AddFolderTest
  * CopyFolderTest
  * DeleteFolderTest
  * ExportToZIPTest
  * MoveFolderTest
  * ReloadFolderTest
  * RenameFolderTest

* tests.MainToolbar
  * Logout - logs an logged in user out. (depends on successful login)
  * OpenBugReport
  * OpenCredentials
  * OpenDocumentation
  * OpenForum
  * SearchTest - uses search input to search for "hello" example

* tests.personal
  * AddContactTest
  * ChangePassword
  * ImportContactTest
  * PrivateKeyTest
  * ProfileTest
  * RemoveCookiesTest
  * SignatureTest


* tests.tools
  * ExportDropboxTest
  * ImportDropboxTest
  * RegistrationTest

## Errors seeded 
* com.logicaldoc.gui.frontend.client.security.SetPassword - sizevalidator removed
* com.logicaldoc.gui.frontend.client.document.grid.DocumentListGrid - setdocuments if statement removed

# ideas for tests

caption:

:+1: := Test exists and runs without errors (pray to the mighty xpath for his goodwill)

* := Test exists, but needs to be fixed

:warning: := To be created

* folder actions

  * :+1: New folder
  * :+1: Reload folders
  * Rename folder
  * Delete folder
  * Add bookmark
  * Move folder
  * Copy and Paste folder
  * Export to ZIP

* file actions

  * :+1: Download
  * :+1: Preview
  * :+1: Cut
  * :+1: Copy
  * :+1: Delete
  * :+1: Add as bookmark
  * :+1: Send by email
  * Checkout
  * Checkin
  * :+1: Lock
  * :+1: Unlock
  * :+1: Change file's language
  * :+1: tag file
  * :+1: Vote file
  * :warning: check different versions
  * More

    * :+1: Index
    * :+1: Mark indexable
    * :+1: Mark unindexable
    * :+1: Make immutable
    * Sign


* personal settings


  * :+1: Profile
  * :+1: Change password
  * Signature
  * :+1: Private Key
  * :+1: Contacts

    * Add Contact
    * Import Contacts from file

  * :+1: Remove Cookies


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
