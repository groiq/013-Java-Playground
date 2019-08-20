package at.bfi.coders.bay.exercises.unit2._10.caesarCypher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImportEnglishWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rawList = "" + 
				"the	Article	1	1	Pre-primer\r\n" + 
				"be	Verb	2	2	primer\r\n" + 
				"to	Preposition	3	7, 9	Pre-primer\r\n" + 
				"of	Preposition	4	4	Grade 1\r\n" + 
				"and	Conjunction	5	3	Pre-primer\r\n" + 
				"a	Article	6	5	Pre-primer\r\n" + 
				"in	Preposition	7	6, 128, 3038	Pre-primer\r\n" + 
				"that	Conjunction et al.	8	12, 27, 903	primer\r\n" + 
				"have	Verb	9	8	primer\r\n" + 
				"I	Pronoun	10	11	Pre-primer\r\n" + 
				"it	Pronoun	11	10	Pre-primer\r\n" + 
				"for	Preposition	12	13, 2339	Pre-primer\r\n" + 
				"not	Adverb et al.	13	28, 2929	Pre-primer\r\n" + 
				"on	Preposition	14	17, 155	primer\r\n" + 
				"with	Preposition	15	16	primer\r\n" + 
				"he	Pronoun	16	15	primer\r\n" + 
				"as	Adverb, conjunction, et al.	17	33, 49, 129	Grade 1\r\n" + 
				"you	Pronoun	18	14	Pre-primer\r\n" + 
				"do	Verb, noun	19	18	primer\r\n" + 
				"at	Preposition	20	22	primer\r\n" + 
				"this	Determiner, adverb, noun	21	20, 4665	primer\r\n" + 
				"but	Preposition, adverb, conjunction	22	23, 1715	primer\r\n" + 
				"his	Possessive pronoun	23	25, 1887	Grade 1\r\n" + 
				"by	Preposition	24	30, 1190	Grade 1\r\n" + 
				"from	Preposition	25	26	Grade 1\r\n" + 
				"they	Pronoun	26	21	primer\r\n" + 
				"we	Pronoun	27	24	Pre-primer\r\n" + 
				"say	Verb et al.	28	19	primer\r\n" + 
				"her	Possessive pronoun	29, 106	42	Grade 1\r\n" + 
				"she	Pronoun	30	31	primer\r\n" + 
				"or	Conjunction	31	32	Grade 2\r\n" + 
				"an	Article	32	(a)	Grade 1\r\n" + 
				"will	Verb, noun	33	48, 1506	primer\r\n" + 
				"my	Possessive pronoun	34	44	Pre-primer\r\n" + 
				"one	Noun, adjective, et al.	35	51, 104, 839	Pre-primer\r\n" + 
				"all	Adjective	36	43, 222	primer\r\n" + 
				"would	Verb	37	41	Grade 2\r\n" + 
				"there	Adverb, pronoun, et al.	38	53, 116	primer\r\n" + 
				"their	Possessive pronoun	39	36	Grade 2\r\n" + 
				"what	Pronoun, adverb, et al.	40	34	primer\r\n" + 
				"so	Conjunction, adverb, et al.	41	55, 196	primer\r\n" + 
				"up	Adverb, preposition, et al.	42	50, 456	Pre-primer\r\n" + 
				"out	Preposition	43	64, 149	primer\r\n" + 
				"if	Conjunction	44	40	Grade 3\r\n" + 
				"about	Preposition, adverb, et al.	45	46, 179	Grade 3\r\n" + 
				"who	Pronoun, noun	46	38	primer\r\n" + 
				"get	Verb	47	39	primer\r\n" + 
				"which		48	58	Grade 2\r\n" + 
				"go	Verb, noun	49	35	Pre-primer\r\n" + 
				"me	Pronoun	50	61	Pre-primer\r\n" + 
				"when		51	57, 136	Grade 1\r\n" + 
				"make	Verb, noun	52	45	\r\n" + 
				"can		53	37, 2973	\r\n" + 
				"like		54	74, 208, 1123, 1684, 2702	\r\n" + 
				"time		55	52	\r\n" + 
				"no		56	93, 699, 916, 1111, 4555	\r\n" + 
				"just	Adjective	57	66, 1823	\r\n" + 
				"him	Pronoun	58	68	\r\n" + 
				"know	Verb, noun	59	47	\r\n" + 
				"take	Verb, noun	60	63	\r\n" + 
				"people	Noun	61	62	\r\n" + 
				"into		62	65	\r\n" + 
				"year	Noun	63	54	\r\n" + 
				"your	Possessive pronoun	64	69	\r\n" + 
				"good	Adjective	65	110, 2280	\r\n" + 
				"some		66	60	\r\n" + 
				"could	Verb	67	71	\r\n" + 
				"them		68	59	\r\n" + 
				"see	Verb	69	67	\r\n" + 
				"other		70	75, 715, 2355	\r\n" + 
				"than		71	73, 712	\r\n" + 
				"then		72	77	\r\n" + 
				"now		73	72, 1906	\r\n" + 
				"look	Verb	74	85, 604	\r\n" + 
				"only		75	101, 329	\r\n" + 
				"come	Verb	76	70	\r\n" + 
				"its	Possessive pronoun	77	78	\r\n" + 
				"over	Preposition	78	124, 182	\r\n" + 
				"think		79	56	\r\n" + 
				"also		80	87	\r\n" + 
				"back		81	108, 323, 1877	\r\n" + 
				"after	Preposition	82	120, 260	\r\n" + 
				"use	Verb, noun	83	92, 429	\r\n" + 
				"two		84	80	\r\n" + 
				"how		85	76	\r\n" + 
				"our	Possessive pronoun	86	79	\r\n" + 
				"work	Verb, noun	87	117, 199	\r\n" + 
				"first		88	86, 2064	\r\n" + 
				"well	Adverb	89	100, 644	\r\n" + 
				"way		90	84, 4090	\r\n" + 
				"even		91	107, 484	\r\n" + 
				"new	Adjective et al.	92	88	\r\n" + 
				"want		93	83	\r\n" + 
				"because		94	89, 509	\r\n" + 
				"any		95	109, 4720	\r\n" + 
				"these		96	82	\r\n" + 
				"give	Verb	97	98	\r\n" + 
				"day		98	90	\r\n" + 
				"most		99	144, 187	\r\n" + 
				"us	Pronoun	100	113";
		
		List<String> wordList = new ArrayList<String>();
		
//		System.out.println(rawList);
		String[] byLines = rawList.split("\r\n");
		System.out.println(Arrays.toString(byLines));
		System.out.println(byLines[0]);
		for (String string : byLines) {
//			System.out.println(string);
			String[] singleWords = string.split("\\s+");
//			System.out.println(Arrays.toString(singleWords));
			System.out.println(singleWords[0]);
			wordList.add(singleWords[0]);
		}
		
		System.out.println(wordList);

	}

}
