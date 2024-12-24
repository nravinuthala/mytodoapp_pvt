pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git url: 'https://github.com/nravinuthala/mytodoapp_pvt.git',
                    credentialsId: 'github_creds',
                    branch: 'Nagaraj'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }

        }
    }
}
