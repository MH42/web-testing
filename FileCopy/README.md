# USAGE

- Put FileTask.java in a package (e.g. ``seedErrors``) in the ``src/``-directory. 
- Create a file ``faultList.txt`` in a directory (e.g. ``errors``) outside the ``src``-folder. 
- When seeding errors, always create both an original file with suffix ``Orig`` and a seeded version (containing the error) with suffix ``Seeded``. 
Please have a look at the example-package for an overview of the file-structure.
- When inserting faults into the code, always mark these errors with a FileID, your personal ID (first letter of pre- and surname) and an ongoing number. See the snippet bewlow and the ``example`` package for more details.
```java
// FileID_YourID_Number START
<seeded error>
// FileID_YourID_Number END
```
- Please have a look at the main-method in ``file/FileTask.java`` for a complete example that shows how to use the error seeding stuff.
