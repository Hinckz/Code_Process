SELECT *
  FROM Purchasing.PurchaseOrderHeader
  WHERE SubTotal BETWEEN '2910' AND '2990';

  /*
Missing Index Details from SQLQuery5.sql - HINCKZ.AdventureWorks2019 (HINCKZ\Hinckz (54))
The Query Processor estimates that implementing the following index could improve the query cost by 62.5748%.
*/


USE [AdventureWorks2019]
GO
CREATE NONCLUSTERED INDEX My_OrderHeader_Index
ON [Purchasing].[PurchaseOrderHeader] ([SubTotal])
INCLUDE ([RevisionNumber],[Status],[EmployeeID],[VendorID],[ShipMethodID],[OrderDate],[ShipDate],[TaxAmt],[Freight],[TotalDue],[ModifiedDate])
GO