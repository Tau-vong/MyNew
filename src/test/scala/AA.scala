object AA {
  def main(args: Array[String]): Unit = {

    val aa = "1,2019-04-30,00:00:00:00:00:00,,Apple,5,北京市,中国,,,,,Product_view,227ab4aa-f065-45c7-b2e8-1ce88f2445df_1557021743,55FF0EB2-CA8A-4EF1-8390-637A5EDC0B88,1965F6CB-C64A-4390-ACE1-597DC187A677,221.219.148.95,ef3c069aaf7eaa81022eb5d8f8b5316b,,e3f5536a141811db40efd6400f1d0a4e,,\"iPad8,5\",wifi,,,ios,12.2,,1108971631828316162,霓净思玻尿酸舒活喷雾水——（JF1903）,北京市,1156110000,,1,,,37266,APP,direct,,,1556600527599,1557021743117,,"

    val bb = "1,2019-04-30,00:00:00:00:00:00,,Apple,5,北京市,中国,,,,,Product_view,ded79040-13e9-4db2-8fa3-0b4a5f8a41ec_1557021743,3FB11F44-A0A2-48BA-B0A7-21FB14B72196,F76C8B38-8B0E-455E-8C7D-210E53A1E1C2,223.104.3.189,c2cf83ec88f6d65a4a91e9d694b203ab,,e3f5536a141811db40efd6400f1d0a4e,,iPhone 6 Plus,4g,,China Mobile(China),ios,12.0.1,,1116642925512273921,sisley魅惑口红 3.4g,北京市,1156110000,,1,,,6277602,APP,direct,,,1556586460658,1557021743117,,"

    val c = aa.split(",",-1)
    val d = bb.split(",",-1)
    for(cc<-c){
      println(cc)
    }
    for(dd<-d){
      println(dd)
    }
  }

}
