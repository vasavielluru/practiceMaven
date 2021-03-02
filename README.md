# practiceMaven
this is dummy file. It is commited.And Added certain paths. Added rubbish dir
cron is given, build happens for time interval irresecpective of commits
if poll scm is used it to build if there are any commits in the time interval specified.
Sometimes not all the commits are supposed to trigger the CI/CD workflow, for example: commits in README.md, commits in the documentation directory, or commits in a directory for which there is a separate Jenkins job configured, because builds(or build agents) are not always free and comes at a cost, and more importantly other Jenkins jobs could be in queue.
Now you want to ignore Jenkins build/trigger if commits are in either rubbish-dir or in README.md, then you need to add these two in the excluded regions under Git additional behaviors.
That’s it. Now Jenkins will only poll for the changes in src directory or in pom.xml. Similarly if you need another Jenkins job to only poll for changes in rubbish-directory, then add the “rubbish-dir/.*” to the Included Regions. 
thank you.
