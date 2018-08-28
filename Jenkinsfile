pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn test'
                }
            }
        }
        
         stage ('Checkstyle Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn checkstyle:checkstyle'
                }
            }
        }

        //stage ('Deployment Stage') {
          //  steps {
            //    withMaven(maven : 'maven_3_5_0') {
              //      bat 'mvn deploy'
               // }
           // }
       // }
    }
}