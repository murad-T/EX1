# תרגיל 1 - MiniShell

## סקירה כללית
בתרגיל זה תבנו תוכנת שורת פקודה פשוטה בשפת Java המדמה מסוף (Terminal). המשתמש יוכל להקליד פקודות כמו cd, ls, mkdir, pwd ולקבל פלט בהתאם, תוך כדי עבודה עם מערכת הקבצים של המחשב.

## מטרות התרגיל
1. לתרגל את הנושא של תכנות מונחה עצמים (OOP): שימוש במחלקות, בנאים, אובייקטים, שיטות ושדות (תכונות).
2. ללמוד ולתרגל עבודה עם קבצים ותיקיות באמצעות java.io.File.
3. לנהל לולאות קלט ופלט מול המשתמש.
4. לבצע תיעוד בסיסי של הקוד ולערוך מחקר על ספריות מובנות בשפה.
5. ללמוד ולתרגל עבודה עם Git ו-GitHub.

## התרגיל מחולק לשלושה חלקים:

### חלק 1: מחקר על מערכת הקבצים
יש להגיש את המחקר בקובץ `docs/FILESYSTEM_RESEARCH.md`

בצעו מחקר קצר וענו על השאלות הבאות בקובץ:
1. איך יוצרים תיקייה בג'אווה?
2. איך יוצרים קובץ?
3. איך בודקים אם קובץ/תיקייה קיימים?
4. איך מציגים את תוכן תיקייה?
5. (רשות) מה ההבדל בין File ל-Path?

לכל שאלה יש לכתוב:
- הסבר קצר (2-3 שורות).
- דוגמת קוד פשוטה.
- קישור למקור (תיעוד רשמי/מדריך).

### חלק 2: מימוש התוכנית
קבצים:
- `src/ShellCommandHandler.java`
- `src/MiniShell.java`

מבנה מחלקות:

**מחלקה ראשונה: מחלקת ShellCommandHandler**
| שדה | תיאור |
|-----|-------|
| private File currentDirectory | תיקייה נוכחית שהמשתמש נמצא בה כרגע |

| בנאי | תיאור |
|------|-------|
| public ShellCommandHandler() | קובע את התיקייה הנוכחית לתיקיית העבודה |

| שיטות | תיאור |
|-------|-------|
| public void printWorkingDirectory() | מציג את הנתיב המלא של התיקייה הנוכחית |
| public void listDirectory() | מציג את כל הקבצים והתיקיות בתיקייה הנוכחית |
| public void changeDirectory(String name) | משנה תיקייה נוכחית (cd) |
| public void makeDirectory(String name) | יוצרת תיקייה חדשה |
| public void createFile(String name) | יוצרת קובץ חדש |
| public void printHelp() | מציגה את הפקודות הנתמכות |
| public File getCurrentDirectory() | מחזירה את התיקייה הנוכחית |

**מחלקה שנייה: מחלקת MiniShell**
| שיטה | תיאור |
|------|-------|
| public static void main(String[] args) | קוראת לפקודות המתאימות מהמשתמש ומפעילה את הפקודות דרך ShellCommandHandler |

על התוכנית:
- להציג את הנתיב הנוכחי כל פעם.
- לקרוא פקודות מהמשתמש עם Scanner.
- להפעיל את הפקודות המתאימות (כגון: pwd, mkdir, cd וכו').
- לצאת מהלולאה כאשר המשתמש מקליד exit.
- במידה והפקודה לא חוקית, להציג: "Unknown command. Type 'help' to see available commands."

### חלק 3: תיעוד וקובץ README
קבצים:
- README.md
- הערות בתוך הקוד.

יש לכתוב:
- תיאור כללי של הפרויקט.
- הוראות כיצד לקמפל ולהריץ את הקוד.
- דוגמה להרצת הפקודות.
- הערות בקוד שמסבירות כל שיטה.

### חלק 4: עבודה עם Git ו-GitHub
מה לעשות:
1. צרו את מבנה התיקיות הבא:
   ```
   - src/
     - MiniShell.java
     - ShellCommandHandler.java
   - docs/
     - FILESYSTEM_RESEARCH.md
   - README.md
   ```

2. אתחלו מאגר Git.
3. בצעו לפחות שלושה קומיטים משמעותיים (לדוגמה: "מימוש mkdir", "הוספת עזרה").
4. צרו ריפוזיטורי חדש ב-GitHub, הוסיפו remote.
5. ודאו שהקוד מופיע ב-GitHub.

## דוגמה לפלט
```
Welcome to MiniShell! Type 'help' for a list of commands.
/home/user > pwd
/home/user
/home/user > mkdir test_dir
Directory created: test_dir
/home/user > cd test_dir
/home/user/test_dir > touch hello.txt
File created: hello.txt
/home/user/test_dir > ls
[FILE] hello.txt
/home/user/test_dir > cd ..
/home/user > exit
Exiting shell.
```

בהצלחה!
