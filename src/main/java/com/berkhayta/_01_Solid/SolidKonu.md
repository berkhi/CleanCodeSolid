# SOLID Prensipleri
## S- Single Responsibility Principle (SRP)
## O- Open-Closed Principle (OCP)
## L- Liskov Substitution Principle(LSP)
## I- Interface Segregation Principle(ISP)
## D- Dependency Inversion Principle(DIP)


# Kötü Tasarımlar:
Uncle Bob - Clean Code
1. Katılık: Sistemde bir değişiklik yapmakta zorluk çekiyorsanız bunun sebebi tasarımınızın katı olmasıdır. (Tight) 
2. Kırılgınlık: Sisteminizde bir hata var. Bu hatayı gidermeye çalışırken başka bir hata alıyorsunuz.
3. Taşınmazlık: Tasarımda eğer tekrar kodları kullanmakta zorluk yaşıyorsanız tasarım hatalıdır.

# SOLID Prensipleri ile Amaçlanan Nedir?
Kötü tasarımdan kaçınmak.
Tasarımlarımızın esnek, anlaşılır, yönetilebilir olmasını sağlamak.

# SOLID : Sağlam
## S- Single Responsibility Principle (SRP) 

Oluşturduğunuz yapılar(metod-sınıflar-interface-enum) tek bir görevi yerine getirmelidirler.
Her biri sadece belirlenen işlevi yerine getirmelidir.
Bu yapılda bir değişiklik yapmak için TEK BİR SEBEBİNİZ olmalı.

İsviçre Çakısını biz sevmiyoruz.
Takım çantası seviyoruz. 

Giant Hulk sınıflar istemiyoruz!
Süpermen Sınıflar da sevmiyoruz!

SRP Uygun Sınıf -> İçerisinde bulunan metodlar o sınıfla ilgili olmalı. Alakasız metodlar aynı sınıfta bulunmamalı.
SRP Uygun Metod -> Bir metod birden fazla işlem yapmamalı. Eğer yapıyorsa, diğer işi yapan kodlar cut-paste ile
yeni bir metoda taşınmalı.
SRP Uygun Statement -> Eğer bir statement çok uzunsa ve birden çok iş yapıyorsa onu da metoda çevirmelisiniz.

kaydet(Musteri m){
//vt'ye kaydedecek kodlar.
}
kaydet(Musteri m, Veritabanı t){
// burası VeritabanıSecVeKaydet()
}


## O- Open-Closed Principle (OCP)
Projedeki tüm yapıların gelişime açık ama değişime kapalı olmasıdır.
Yazdığınız kodlarda değişiklik yapma ihtiyacı olmadan yeni nesneler ile çalışabilmeyi başarması lazım.
Kodunuzu değişim gerektirmeyecek şekilde yazabilirseniz ÇOK DOĞRU YOLDAsınız.
 OCP'ye uygun hale getirmek için Polimorfizm ve Abstraction'dan (Interface || Abstract Class) yararlanırız.


## L- Liskov Substitution Principle(LSP)
Alt sınıflar oluşan nesnelerin, üst sınıfın nesneleri ile yer değiştirdiğinde aynı davranışı sergileyebilmesi gerekir.
Alt sınıflar, üst sınıfların tüm özelliklerini kullanmalıdır.
Ama kullanılmayacak durumlar var ise bunları ayrıştırmak gereklidir.



## I- Interface Segregation Principle(ISP)
Nesnelerin ihtiyaç duymayacağı metodları Interface içinden çıkartmamızı önerir.
Bir interface'de gereğinden fazla metod imzası bulunmamalı.
Böyle bir sorunla karşılaşınca interface içindeki metodlar ayrıştırılır ve yeni interfacelere taşınmalıdır.


## D- Dependency Inversion Principle(DIP)
Yüksek seviyedeki sınıflar, düşük seviyedeki sınıflara bağlı olmamalıdır.
Her 2 sınıf da soyut kavramlara bağlı olsunlar. (Abstract class, interface)