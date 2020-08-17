package com.crazylegend.kotlinextensions.regex


/**
 * Created by hristijan on 3/7/19 to long live and prosper !
 */

/**
 * Regex for names
 */
const val NAME_REGEX = "^[a-zA-Z\\s]+"


/**
 * Regex of simple mobile.
 */
const val REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$"

/**
 * Regex of exact mobile.
 *
 * virtual operator: 170
 */
const val REGEX_MOBILE_EXACT = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(16[6，5])|(17[0,1,3,5-8])|(18[0-9])|(19[8,9]))\\d{8}$"

/**
 * Regex of telephone number.
 */
val REGEX_TEL = "^0\\d{2,3}[- ]?\\d{7,8}"

/**
 * Regex of id card number which length is 15.
 */
val REGEX_ID_CARD15 = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$"

/**
 * Regex of id card number which length is 18.
 */
val REGEX_ID_CARD18 = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$"

/**
 * Regex of email.
 */
const val REGEX_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"

/**
 * Regex of url.
 */
const val REGEX_URL = "[a-zA-z]+://[^\\s]*"

/**
 * Regex of Chinese character.
 */
const val REGEX_ZH = "^[\\u4e00-\\u9fa5]+$"

/**
 * Regex of username.
 *
 * scope for "a-z", "A-Z", "0-9", "_", "Chinese character"
 *
 * can't end with "_"
 *
 * length is between 6 to 20
 */
val REGEX_USERNAME = "^[\\w\\u4e00-\\u9fa5]{6,20}(?<!_)$"

/**
 * Regex of date which pattern is "yyyy-MM-dd".
 */
val REGEX_DATE = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$"

/**
 * Regex of ip address.
 */
val REGEX_IP = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)"


/**
 * Regex of double-byte characters.
 */
val REGEX_DOUBLE_BYTE_CHAR = "[^\\x00-\\xff]"

/**
 * Regex of blank line.
 */
val REGEX_BLANK_LINE = "\\n\\s*\\r"

/**
 * Regex of QQ number.
 */
val REGEX_QQ_NUM = "[1-9][0-9]{4,}"

/**
 * Regex of positive integer.
 */
val REGEX_POSITIVE_INTEGER = "^[1-9]\\d*$"

/**
 * Regex of negative integer.
 */
val REGEX_NEGATIVE_INTEGER = "^-[1-9]\\d*$"

/**
 * Regex of integer.
 */
val REGEX_INTEGER = "^-?[1-9]\\d*$"

/**
 * Regex of non-negative integer.
 */
val REGEX_NOT_NEGATIVE_INTEGER = "^[1-9]\\d*|0$"

/**
 * Regex of non-positive integer.
 */
val REGEX_NOT_POSITIVE_INTEGER = "^-[1-9]\\d*|0$"

/**
 * Regex of positive float.
 */
val REGEX_POSITIVE_FLOAT = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$"

/**
 * Regex of negative float.
 */
val REGEX_NEGATIVE_FLOAT = "^-[1-9]\\d*\\.\\d*|-0\\.\\d*[1-9]\\d*$"

/**
 * Regex for validating email.
 */
val EMAIL_PATTERN_REGEX =
        "([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)"

/**
 * Regex for validating url.
 */
val URL_PATTERN_REGEX =
        "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)"

/**
 * Regex for validating map co-ordinates.
 *
 * ```
 * Matches
 * -------
 * +90.0, -127.554334
 * 45, 180
 * -90, -180
 * -90.000, -180.0000
 * +90, +180
 * 47.1231231, 179.99999999
 *
 * Doesn't Match
 * -------------
 * -90., -180.
 * +90.1, -100.111
 * -91, 123.456
 * 045, 180
 * ```
 */
val MAP_PATTERN_REGEX =
        "[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?)°?\\s*(N|S|E|W)?,\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)°?\\s*(N|S|E|W)?"