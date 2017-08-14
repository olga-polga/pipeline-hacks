import hudson.model.*
import hudson.EnvVars
pipeline {
    agent any

    stages {
        stage('Get Env') {
            steps {
                echo "env.BUILD_URL -----${env.BUILD_URL}-----"
                echo "env.JAVA_HOME -----${env.JAVA_HOME}-----"
                echo "env.NODE_NAME -----${env.NODE_NAME}-----"
                echo "env.JOB_NAME  -----${env.JOB_NAME}-----"
            }
        }
    }
}