# Mine Sweeper

## Görev

Java dilinde Mayın Tarlası oyunu yapmanızı bekliyoruz.

### Oyun Kuralları
- Oyun metin tabanlıdır.
- Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
- Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
- Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
- Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
- Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
- Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
- Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
- Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.

## Ekran Görüntüleri

- Oyunu Kazanma Senaryosu
  
![mayinTarlasiSuccess1](https://github.com/yusufcandmrz/mine-sweeper/assets/93606208/3f2cf889-233b-43e7-a9bb-1a14e237a69a)

![mayinTarlasiSuccess2](https://github.com/yusufcandmrz/mine-sweeper/assets/93606208/d28317b2-45ee-4015-93b9-07aa87de483e)


- Oyunu Kaybetme Senaryosu

![mayinTarlasiFailure](https://github.com/yusufcandmrz/mine-sweeper/assets/93606208/69787f5c-8be3-44b5-b85f-bcc7fb9af382)
