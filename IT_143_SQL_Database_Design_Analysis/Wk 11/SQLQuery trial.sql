SELECT WestEnsignBalanceTable.Ukey, WestEnsignHistoryTable.Product
FROM WestEnsignBalanceTable
JOIN WestEnsignHistoryTable ON WestEnsignBalanceTable.Ukey = WestEnsignHistoryTable.Ukey
WHERE WestEnsignBalanceTable.SavingsBalance = WestEnsignHistoryTable.NewBalance;

SELECT WestEnsignBalanceTable.Ukey, AVG(WestEnsignHistoryTable.Amount) AS AverageAmount
FROM WestEnsignBalanceTable
JOIN WestEnsignHistoryTable ON WestEnsignHistoryTable.Ukey = WestEnsignHistoryTable.Ukey
WHERE WestEnsignHistoryTable.Product = '0'
GROUP BY WestEnsignBalanceTable.Ukey;

SELECT WestEnsignBalanceTable.Ukey, WestEnsignHistoryTable.Entry_date, 
SUM(WestEnsignHistoryTable.Amount) OVER (PARTITION BY WestEnsignBalanceTable.Ukey ORDER BY WestEnsignHistoryTable.Entry_date) AS CumulativeAmount
FROM WestEnsignBalanceTable
JOIN WestEnsignHistoryTable ON WestEnsignBalanceTable.Ukey = WestEnsignHistoryTable.Ukey
ORDER BY WestEnsignBalanceTable.Ukey, WestEnsignHistoryTable.Entry_date;

SELECT WestEnsignBalanceTable.Ukey, MAX(WestEnsignBalanceTable.BalanceDate) AS FixedBalanceDate
FROM WestEnsignBalanceTable
JOIN WestEnsignHistoryTable ON WestEnsignBalanceTable.Ukey = WestEnsignHistoryTable.Ukey
GROUP BY WestEnsignBalanceTable.Ukey;

SELECT WestEnsignBalanceTable.Ukey, WestEnsignBalanceTable.openDate, WestEnsignHistoryTable.Entry_date
FROM WestEnsignBalanceTable
JOIN WestEnsignHistoryTable ON WestEnsignBalanceTable.Ukey = WestEnsignHistoryTable.Ukey
WHERE WestEnsignBalanceTable.openDate < WestEnsignHistoryTable.Entry_date;

SELECT WestEnsignBalanceTable.Ukey, WestEnsignBalanceTable.SavingsBalance, WestEnsignBalanceTable.CheckingBalance, WestEnsignHistoryTable.NewBalance
FROM WestEnsignBalanceTable
JOIN WestEnsignHistoryTable ON WestEnsignBalanceTable.Ukey = WestEnsignHistoryTable.Ukey
WHERE WestEnsignHistoryTable.Entry_date = (
    SELECT MAX(Entry_date)
    FROM WestEnsignHistoryTable
    WHERE Ukey = WestEnsignBalanceTable.Ukey)
AND WestEnsignBalanceTable.SavingsBalance > WestEnsignBalanceTable.CheckingBalance;

SELECT avocado.region, avocado.Avail_Date, 
SUM(avocado.Total_Volume) OVER (PARTITION BY avocado.region ORDER BY avocado.Avail_Date) AS CumulativeVolume
FROM avocado
JOIN avocado_area_geocode ON avocado.region = avocado_area_geocode.area_name
ORDER BY avocado.region, avocado.Avail_Date;

SELECT avocado.Total_Bags, avocado.AveragePrice, avocado_area_geocode.area_name
FROM avocado
JOIN avocado_area_geocode ON avocado.region = avocado_area_geocode.area_name
WHERE avocado.AveragePrice > 2.0;

SELECT avocado.region, avocado.year_p, avocado.Total_Bags
FROM avocado
JOIN avocado_area_geocode ON avocado.region = avocado_area_geocode.area_name
WHERE avocado.Total_Volume > 85000 AND avocado_area_geocode.area_type = 'city';

SELECT avocado.region, MAX(avocado.Avail_Date) AS LatestAvailDate
FROM avocado
JOIN avocado_area_geocode ON avocado.region = avocado_area_geocode.area_name
GROUP BY avocado.region;

SELECT avocado.region, SUM(avocado.Total_Bags) AS TotalBags
FROM avocado
JOIN avocado_area_geocode ON avocado.region = avocado_area_geocode.area_name
GROUP BY avocado.region;

