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
<li>LoginMethod - logs in User "admin" with password "admin" </li>
<li>BadLoginMethod - Denies unknown User "noadmin" with password "noadmin" access to application.</li>
<li>Logout - logs an logged in user out. (depends on successful login)</li>
</ul>
