pipeline{
  agent none
  triggers { cron('* * * * *') }
  options
  {
    timeout(time: 15,unit :' MINUTES')
    timestamps()
  }
  stages
  {
    stage('Example') {
            input {
                message "Should we continue?"
                ok "Yes, we should."
            }
    }
    stage("build")
    {
    agent {
 docker
      {
        image 'maven: 3.6.3-jdk-8'
        args '-v /root/.m2:/root/.m2'
      }
    }
      steps
      {
      sh 'mvn compile'
      }
       post
    {
      success
      {
        echo "build is successful!"
      }

    }
    }
   stage ('package')
    {
      agent {
 docker
      {
        image 'maven: 3.6.3-jdk-11'
        args '-v /root/.m2:/root/.m2'
      }
    }
      steps
      {
      sh 'mvn package'
      }
       post
    {
      fixed
      {
        echo "package is successful!"
      }

    }
    }
    } 
  post 
  {
    always
    {
      echo "runs the steps regardless of completion status!"
    }
    fixed
    {
echo "previous build is failed and current build is successful!"
     }
    changed
    {
      echo "the current pipeline has different completion status compared to pervious!"
    }
    regression
    {
      echo "the current pipeline status is failed or unstable or aborted and previous run was successful!"
    }
    aborted
    {
      echo "the current pipeline is aborted!"
    }
    failure
    {
      echo "pipeline running is failed!"
    }
    success
    {
      echo "pipeline running is successful!"
    }
    unstable
    {
      echo "the pipeline run has unstable status caused by test failure code violations"
    }
    cleanup
    {
      echo "if previous posts are excuted then only this will be executed!"
    }
  }
}
