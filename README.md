Foundation
==========
**Foundation is still WIP, and cannot be tested yet**

* [Forum thread]
* [Wiki]
* [Issues]
* [Source code]
* [Twitter]

Foundation is an Essentials-replacement for Sponge. Rather than providing all functionality in one plugin, Foundation is modular, and you choose what you want to have installed. We (and other developers) are developing Modules using the Foundation API, which are loaded by the Foundation plugin. Using this system, you don't have unnecessary functionality installed on your server, which results in better performance.

--------------------

#### Building
#####Prerequires
* [Java SDK 6]
* [Git]

##### Clone the repository
Setup git, and run the following command in the Git Bash:

    $ git clone https://github.com/FoundationDriven/Foundation.git
    $ cd Foundation

Install the pre-commit hook script:

    $ cp script/pre-commit.sh .git/hooks

##### Compile using Gradle
On Windows:

    $ gradlew

On Unix and Mac:

	$ sh gradlew

or if you encounter some problems

	$ bash gradlew

--------------------

#### Contributing
If you'd like to contribute to the project, please read the `CONTRUBUTING.md` file included in the repository. All your contributed code will be automatically licensed under the MIT license.
If you are fixing an issue, you can just create a pull request.

--------------------

#### JavaDocs
If you would like to see our JavaDocs (helpful for API development), please go to our website at http://foundationdriven.github.io/docs/
If you notice that our JDs are outdated, please:
1. Note that JavaDocs are (generally) updated every Saturday. It would be very impractical to update them every day as this must be done manually.
2. If the JDs are over 2 weeks out of date, please create an issue or pull request at the [website repo]. We'll get to them ASAP.

--------------------

#### I found an issue!
No software is absolutely perfect. If you found a bug or something else, please let us know by creating an issue. You can create an issue report here on GitHub. Please be as descriptive as possible, so a developer can fix the issue and create a pull request.

--------------------

####Common Sense
Remember, our developers have school or work during the week and we have lives too! Be sure to be patient, be respectful, and use common sense.
We hope you can enjoy Foundation as much as we love developing it. From your dev team, based around the world, have fun.
~ The FoundationDriven Team (@sam4215, @exstar, and @OscarOrSomething)
[Forum thread]: http://forums.spongepowered.org/t/1525/
[Wiki]: https://github.com/FoundationDevTeam/Foundation/wiki
[Issues]: https://github.com/FoundationDevTeam/Foundation/issues
[Source code]: https://github.com/FoundationDevTeam/Foundation/tree/master/src
[Twitter]: https://twitter.com/foundationdev

[Java SDK 6]: http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase6-419409.html
[Git]: http://git-scm.com/

[website repo]: https://github.com/FoundationDriven/FoundationDriven.github.io
