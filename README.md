# Lab 4 – Encapsulation (Section 2E)

**Name:** James Munoz
**Section:** BSIT 2E

## Console Output

Original methods on all vehicles
Isuzu, VehiCROSS, 1997
Age: 29
Vintage: true

Daihatsu, Copen, 2004
Age: 22
Vintage: false

Suzuki, Cappuccino, 1995
Age: 31
Vintage: true

Getters
Brand: Isuzu, Model: VehiCROSS, Year: 1997
Brand: Daihatsu, Model: Copen, Year: 2004
Brand: Suzuki, Model: Cappuccino, Year: 1995

setYear tests on vehicle 1
setYear(2000) -> true; year is 2000; age 26; vintage true
setYear(1885) -> false; year remains 2000
setYear(2027) -> false; year remains 2000

Constructor invalid year tests
New vehicle with year 1885 -> initial year is 2026
New vehicle with year 2027 -> initial year is 2026