# 06/14/2016
# Luis Mojica
# UTD
# Trolling Dataset Description

There are 1001 conversations/snippets along with their annotations.

** The file annotations.txt containts all the snippet annotations. There are 5
lines per snippet:

1) Snippet id. i.e.: 3im30u$cuhl3kv$cui2pfc, where 3im30u is the comment identi-
fier for the the conversation root. This is needed to find the conversation to
which this snippet corresponds.

2) CON 'Intention Disclosure (D)' annotation for suspected troll.

3) AIN 'Trolling Intention (I)' annotation for the suspected troll.

4) CIN 'Trolling Interpretation (R)' dictionary of annotations for each of the 
direct responses for the suspected troll.

5) CRES 'Response Strategy (B)' dictionary of annotations for each of the 
direct responses for the suspected troll. Every comment in the dictionary is 
identified by a key composed by comment identifier followed by the author's user-
username. i.e.: 'cuiari6~nekokuroneko'.

**  The file snippets.txt containts all the snippets. There are 9
lines per snippet:

1) Snippet id. i.e.: 3im30u$cuhl3kv$cui2pfc, where 3im30u is the comment identi-
fier for the the conversation root. This is needed to find the conversation to
which this snippet corresponds.

2) 'direct_response_text': dictionary with direct response's text or comment

3) 'troll_id': suspected troll comment identifier

4) 'parent_author': username of suspected troll parent's comment

5) 'parent_id': suspected troll parent's comment identifier

6) 'name_commentId_dic': dictionary mapping direct responses comment identifiers
and their authors username

7) 'troll_text': comment made by the suspected troll

8) 'parent_text': comment made by the suspected troll's parent

9) 'troll_author': username of suspected troll

**  The folder conversations. There is two files per conversation:

1) The files *.comment contain the conversation comments. There is one comment
per line. Each line, immediately before the comment's text has the comment iden-
tifier followed by the comment id. i.e.: #3fcsiu:ProudChinaFag$:  These can be
used to recreate the conversation thread.

2) The files *.ajd containt the adjacency list for each comment in the conversa-
tion threa.

** The features_prefix.txt file describes the name of the features in the correspoding
jsom feature files found in the features directory.

The features directory contains 4 files. Each corresponds to a task: "I": interpretation,
"D": disclosure, "R": Interpretatio and "B": Response strategy. The files are stored in
json format.

The files contain all instances for the task indexed by a long comment identifier 
(thread_id+parent_id+comment_id, i.e.: 3im30u$cuhl3kv$cui2pfc) along with a named dictionary 
describing the features in them. The "glove" feature is a list of 400 real numbers 
that correspond to the comment glove vector.

