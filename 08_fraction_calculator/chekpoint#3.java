{\rtf1\ansi\ansicpg1251\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;\f1\fmodern\fcharset0 Courier-Oblique;}
{\colortbl;\red255\green255\blue255;\red191\green100\blue38;\red32\green32\blue32;\red153\green168\blue186;
\red254\green187\blue91;\red133\green96\blue154;\red109\green109\blue109;\red88\green118\blue71;\red86\green132\blue173;
}
{\*\expandedcolortbl;;\csgenericrgb\c74902\c39216\c14902;\csgenericrgb\c12549\c12549\c12549;\csgenericrgb\c60000\c65882\c72941;
\csgenericrgb\c99608\c73333\c35686;\csgenericrgb\c52157\c37647\c60392;\csgenericrgb\c42745\c42745\c42745;\csgenericrgb\c34510\c46275\c27843;\csgenericrgb\c33725\c51765\c67843;
}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0

\f0\fs28 \cf2 \cb3 import \cf4 java.util.*\cf2 ;\
public class\
\cf4 Checkpoint \{\
\
    \cf2 public static void \cf5 main\cf4 (String[] args) \{\
        Scanner scanner = \cf2 new \cf4 Scanner(System.
\f1\i \cf6 in
\f0\i0 \cf4 )\cf2 ; \cf7 // Input scanner method\
        \cf4 System.
\f1\i \cf6 out
\f0\i0 \cf4 .println(\cf8 "Write your problem. If you want to stop, write quit "\cf4 )\cf2 ;\
        \cf4 String problem = \cf8 " "\cf2 ;\
        boolean \cf4 check = \cf2 true;\
        while \cf4 (check) \{\
            problem = scanner.nextLine()\cf2 ;\
            if \cf4 (problem.contains(\cf8 "+"\cf4 ) || problem.contains(\cf8 "-"\cf4 ) || problem.contains(\cf8 "*"\cf4 ) || problem.contains(\cf8 "/"\cf4 )) \{\
                System.
\f1\i \cf6 out
\f0\i0 \cf4 .println(\cf8 "OK"\cf4 )\cf2 ;\
                \cf4 check = \cf2 false;\
            \cf4 \}\
            \cf2 else if \cf4 (problem.equals(\cf8 "quit"\cf4 )) \{\
                \cf2 return;\
            \cf4 \}\
            \cf2 else \cf4 \{\
                System.
\f1\i \cf6 out
\f0\i0 \cf4 .println(\cf8 "Your input incorrect, try again"\cf4 )\cf2 ;\
            \cf4 \}\
        \}\
        String second = 
\f1\i second_fraction
\f0\i0 (problem)\cf2 ; \cf7 // take second fraction as a string\
        \cf4 String first = 
\f1\i first_fraction
\f0\i0 (problem)\cf2 ;\
        \cf4 System.
\f1\i \cf6 out
\f0\i0 \cf4 .println(first)\cf2 ;\
        \cf4 System.
\f1\i \cf6 out
\f0\i0 \cf4 .println(second)\cf2 ;\
        
\f1\i \cf4 produceAnswer
\f0\i0 (problem)\cf2 ;\
    \cf4 \}\cf7 // close main\
    /*\
    * main - main function\
    * produceAnswer - Function where I determine first and second fraction\
    * x1- first one\
    * x2 - second\
     */\
    /*\
    produceAnswer is function which take second fraction as String\
     */\
    \cf2 public static \cf4 String  \cf5 second_fraction\cf4 (String problem) \{\
        \cf2 int \cf4 space = problem.indexOf(\cf8 " "\cf4 )\cf2 ; \cf7 // only what I use is "+" symbol\
        \cf4 String x2 = problem.substring(space+\cf9 3\cf2 , \cf4 problem.length())\cf2 ; \cf7 // second fraction\
        \cf2 return \cf4 x2\cf2 ;\
    \cf4 \} \cf7 // close produceAnswer\
    \cf2 public static \cf4 String \cf5 first_fraction\cf4 (String problem) \{\
        \cf2 int \cf4 space = problem.indexOf(\cf8 " "\cf4 )\cf2 ;\
        \cf4 String x1 = problem.substring(\cf9 0\cf2 , \cf4 space)\cf2 ;\
        return \cf4 x1\cf2 ;\
    \cf4 \}\
    \cf2 public static \cf4 String \cf5 produceAnswer\cf4 (String problem)\{\
        String first_fraction = 
\f1\i first_fraction
\f0\i0 (problem)\cf2 ;\
        \cf4 String second_fraction = 
\f1\i second_fraction
\f0\i0 (problem)\cf2 ;\
        int \cf4 first_whole = 
\f1\i whole
\f0\i0 (first_fraction)\cf2 ;\
        int \cf4 first_numerator = 
\f1\i numerator
\f0\i0 (first_fraction)\cf2 ;\
        int \cf4 first_denominator = 
\f1\i denominator
\f0\i0 (first_fraction)\cf2 ;\
        int \cf4 second_whole = 
\f1\i whole
\f0\i0 (second_fraction)\cf2 ;\
        int \cf4 second_numerator = 
\f1\i numerator
\f0\i0 (second_fraction)\cf2 ;\
        int \cf4 second_denominator = 
\f1\i denominator
\f0\i0 (second_fraction)\cf2 ;\
        int \cf4 space = problem.indexOf(\cf8 " "\cf4 )\cf2 ;\
        \cf4 String symbol = problem.substring(space+\cf9 1\cf2 , \cf4 space+\cf9 2\cf4 )\cf2 ;\
        \cf4 System.
\f1\i \cf6 out
\f0\i0 \cf4 .println(symbol)\cf2 ;\
        return \cf8 "Hello"\cf2 ;\
    \cf4 \}\
    \cf7 /*\
    whole/numerator/denominator is functions from checkpoint#2\
     */\
    \cf2 public static int \cf5 whole\cf4 (String fraction) \{\
        \cf2 int \cf4 underscore = fraction.indexOf(\cf8 "_"\cf4 )\cf2 ;\
        int \cf4 division = fraction.indexOf(\cf8 "/"\cf4 )\cf2 ;\
        \cf4 String x1\cf2 ;\
        if \cf4 (underscore == -\cf9 1\cf4 ) \{\
            x1 = fraction.substring(\cf9 0\cf2 , \cf4 fraction.length())\cf2 ;\
            if \cf4 (division != -\cf9 1\cf4 ) \{\
                x1 = \cf8 "0"\cf2 ;\
                return \cf4 Integer.
\f1\i parseInt
\f0\i0 (x1)\cf2 ;\
            \cf4 \}\
            \cf2 return \cf4 Integer.
\f1\i parseInt
\f0\i0 (x1)\cf2 ;\
        \cf4 \}\
        x1 = fraction.substring(\cf9 0\cf2 , \cf4 underscore)\cf2 ;\
        return \cf4 Integer.
\f1\i parseInt
\f0\i0 (x1)\cf2 ;\
    \cf4 \}\cf7 // close whole\
    \cf2 public static int \cf5 numerator\cf4 (String fraction) \{\
        \cf2 int \cf4 underscore = fraction.indexOf(\cf8 "_"\cf4 )\cf2 ;\
        int \cf4 division = fraction.indexOf(\cf8 "/"\cf4 )\cf2 ;\
        \cf4 String x2\cf2 ;\
        if \cf4 (underscore == -\cf9 1 \cf4 && division == -\cf9 1 \cf4 ) \{\
            x2 = \cf8 "0"\cf2 ;\
            return \cf4 Integer.
\f1\i parseInt
\f0\i0 (x2)\cf2 ;\
        \cf4 \}\
        \cf2 if \cf4 (underscore == -\cf9 1\cf4 ) \{\
            x2 = fraction.substring(\cf9 0\cf2 , \cf4 division)\cf2 ;\
            return \cf4 Integer.
\f1\i parseInt
\f0\i0 (x2)\cf2 ;\
        \cf4 \}\
        x2 = fraction.substring(underscore + \cf9 1\cf2 , \cf4 division)\cf2 ;\
        return \cf4 Integer.
\f1\i parseInt
\f0\i0 (x2)\cf2 ;\
    \cf4 \}\cf7 // close numeration\
    \cf2 public static int \cf5 denominator\cf4 (String fraction) \{\
        \cf2 int \cf4 division = fraction.indexOf(\cf8 "/"\cf4 )\cf2 ;\
        \cf4 String x3\cf2 ;\
        if \cf4 (division == -\cf9 1\cf4 ) \{\
            x3 = \cf8 "1"\cf2 ;\
            return \cf4 Integer.
\f1\i parseInt
\f0\i0 (x3)\cf2 ;\
        \cf4 \}\
        x3 = fraction.substring(division+\cf9 1\cf2 , \cf4 fraction.length())\cf2 ;\
        return \cf4 Integer.
\f1\i parseInt
\f0\i0 (x3)\cf2 ;\
    \cf4 \}\cf7 // close denominator\
\cf4 \}\cf7 // close class\
}