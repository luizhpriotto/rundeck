rdeck.base="/var/lib/rundeck"
rss.enabled="false"
grails {
  mail {
    host = "antispam.castrolanda.coop.br"
    username = "rundeck"
    port = 25
    password = "rundeck"
    props = ["mail.smtp.starttls.enable":"false","mail.smtp.auth":"false","mail.smtp.socketFactory.port":"25","mail.smtp.socketFactory.fallback":"false"]
  }
}
grails.mail.default.from = "rundeck@castrolanda.coop.br"
grails.serverURL="http://zabbixdatacenter.castrolanda.coop.br:4440"
dataSource.dbCreate = "update"
dataSource.url = "jdbc:h2:file:/var/lib/rundeck/data/rundeckdb;MVCC=true"
loglevel.default="INFO"