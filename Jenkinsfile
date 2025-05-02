pipeline {
    agent any
    
    tools {
        "maven" "M3"
    }

    stages {
	stage ('Checkout){
	       steps {
			// Get some code from a GitHub repository
	                git url: 'https://github.com/nravinuthala/mytodoapp_pvt.git',
				    credentialsId: "github_creds"
       	       }
	}
        stage('Build') {
            steps {
                
                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }

        }
    }
}
