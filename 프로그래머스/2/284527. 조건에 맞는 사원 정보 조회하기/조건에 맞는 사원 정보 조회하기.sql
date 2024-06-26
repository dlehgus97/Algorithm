SELECT E.SCORE , D.EMP_NO , D.EMP_NAME , D.POSITION , D.EMAIL
FROM HR_EMPLOYEES D JOIN (SELECT EMP_NO , SUM(SCORE) SCORE
                           FROM HR_GRADE
                           GROUP BY EMP_NO) E ON D.EMP_NO = E.EMP_NO
GROUP BY E.EMP_NO
ORDER BY E.SCORE DESC
LIMIT 1;
