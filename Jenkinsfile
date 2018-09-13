pipeline {
    agent any   
    stages {
        stage('Checkout') {
            steps {
                echo "Start checkout project"
                sh 'env'
                step([$class: 'WsCleanup'])
                git url: 'https://github.com/msy53719/ssm_docker.git', branch: 'master'
                echo 'get artifact from pulugins  pipeline.'
            }
        }
        
        stage('build image') {
            steps {
                sh 'env'
                echo 'build docker image'
                sh 'sh ./scripts/package.sh'
            }
        }
        
    }
    post {
    
        always {
            echo 'package report'
            sh 'sh ./script/report.sh'
            archiveArtifacts artifacts: 'test-report*.tar.gz', fingerprint: true
            publishHTML target: [
              allowMissing: false,
              alwaysLinkToLastBuild: false,
              keepAll: true,
              reportDir: './test_report/',
              reportFiles: 'Test.html',
              reportName: 'Html Report'
            ]
            
        emailext attachLog: true, body: '测试报告地址：\n  ${BUILD_URL}/Html_20Report/Test.html', compressLog: true, subject: '测试报告地址', to: '479979298@qq.com'
            
           
        }
        failure {
            echo 'this area is run when failure'
        }
    }

}

