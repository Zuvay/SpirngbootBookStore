# Book Store Project

Bu proje, bir kitap pazarı uygulaması olup, kullanıcıların pazara kitap ekleyebileceği, mevcut kitapları kendi kitaplıklarına ekleyebileceği ve kitapları silebileceği çeşitli fonksiyonlar sunmaktadır. 

## Özellikler

- **Kitap Ekleme:** Kullanıcılar, pazara yeni kitaplar ekleyebilir.
- **Kitapları Görüntüleme:** Pazarda mevcut olan tüm kitapları görüntüleyebilir.
- **Kitaplığına Ekleme:** Pazarda bulunan kitapları kendi kitaplıklarına ekleyebilir.
- **Kitap Silme:** Hem pazardan hem de kendi kitaplığından kitapları silebilir.

## Teknolojiler

- **Java**
- **Spring Boot**
- **Thymeleaf**: Frontend geliştirme için kullanıldı.
- **Katmanlı Mimari**

## Proje Yapısı

Projede katmanlı mimari kullanılmıştır ve aşağıdaki ana katmanlardan oluşur:

- **Controller Katmanı:** HTTP isteklerini karşılayan ve gerekli yönlendirmeleri yapan katman.
- **Service Katmanı:** İş kurallarının ve veri işleme mantığının bulunduğu katman.
- **Repository Katmanı:** Veritabanı işlemlerinin gerçekleştirildiği katman.
