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
        stage ('Deploy') {

        steps {
            // clean up old deployment
            echo "Clean up old deployment"
            sh "curl -u admin:admin123 http://135.13.30.9:8088/manager/text/undeploy?path=/mytodo_app || true"
            
            echo "deploy stage"
            deploy adapters: [tomcat9 (
                    credentialsId: 'tomcat_deploy_credentials',
                    path: '',
                    url: 'http://135.13.30.9:8088'
                )],
                contextPath: 'mytodo_app',
                onFailure: 'false',
                war: '**/*.war'
        }
    }

    }
}
