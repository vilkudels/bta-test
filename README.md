# BTA Mājasdarbs

## Projekta apraksts
Šajā projektā atrodams BTA testēšanas uzdevums par ceļojumu polisēm.
Šis projekts ir izstrādāts, izmantojot **Page Object modeli (POM)**, lai strukturētu un vienkāršotu testu rakstīšanu un uzturēšanu.

## Priekšnosacījumi
- Java JDK
- Maven
- Selenide

## Projekta struktūra
Projekta struktūra ir organizēta šādi:
- **Pages**: Katrs tīmekļa lapas skats ir izveidots kā atsevišķa klase direktorijā `pages/`. Šajās klasēs ir definēti elementi, kas attiecas uz konkrēto lapu.
- **Tests**: Tests izmanto šīs klases, lai veiktu pārbaudes, tādējādi nodrošinot skaidru un vienkāršu testu lasāmību. Tests atrdas `tests/` mapē.

## Projekta palaišana
1. Klonē repozitoriju:
   ```bash
   git clone https://github.com/vilkudels/bta-test.git
2. Atver savu integrēto izstrādes vidi, piemēram IntelliJ IDEA un atver klonēto mapi `bta-test`.
3. Pārliecinās, ka Maven atkarības ir ielādētas pareizi, izmantojot "Reload All Maven Projects".
4. Palaist testu var ar peles labo pogu noklikšķinot uz klases faila un izvēloties "Run" vai arī nospiežot uz "Run" pogas blakus metodei `public void travelInsurancePolicyTest()`.