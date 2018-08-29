pipeline {
    agent any

    stages {
        /*stage ('Compile Stage') {

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

 		stage('SonarQube analysis') {
            steps {
                // Optionally use a Maven environment you've configured already
                withMaven(maven: 'maven_3_5_0') {
                    bat 'mvn sonar:sonar'
                }
            }
        }*/

        //stage ('Deployment Stage') {
          //  steps {
            //    withMaven(maven : 'maven_3_5_0') {
              //      bat 'mvn deploy'
               // }
           // }
       // }
       
       
       stage('SonarQube analysis') {
		    withSonarQubeEnv('My SonarQube Server') {
		      // requires SonarQube Scanner for Gradle 2.1+
		      // It's important to add --info because of SONARJNKNS-281
		      bat './gradlew --info sonarqube'
		    }
		}
       
    }
}