# web-testing

## Setup for Selenium Tests
* run localhost:8080/setup and fill forms
* add one folder (left Sidebar)
* add one file (Documentstab)
* change password to "password" (Personal>Change Password)
* run junit tests

## Problems:

<ol>
<li>Almost all ids change - making location by id very unstable.</li>
</ol>

## Possible Solutions:

<ol>
<li>Some htmltags have classes which seem to be the stay the same. Sadly these elements aren't unique.</li>
<ul>
<li>It is also possible to use the path of image for all buttons having images</li>
</ul>
</ol>
