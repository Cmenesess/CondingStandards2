# Coding Inspection

## Objectives

- Use PMD as a code quality metric tool for preemptive defect detection.
- Obtain a html report with the different detected issues in the code using Maven.

## Requirements
- Java 8 or newer JRE/JDK
- Eclipse IDE for Java Developers >= 2019-09 R (4.13.0)
- Git
## Introduction
PMD is a source code analyzer. It finds common programming flaws like unused variables, empty catch blocks, unnecessary object creation, and so forth. Like other tools, PMD can verify that coding conventions and standards are followed. PMD is more focused on preventive defect detection. It comes with a vast set of rules and is highly configurable. PMD can also configure -
in a simple way - particular rules to use in a specific project.

PMD integrates well with IDEs such as Eclipse and NetBeans, and it also fits well into the build process thanks to its smooth integration with Ant and Maven.

For this lab, we will use Eclipse and Maven together with PMD to inspect the source code of a
project.


## Workshop description

In this activity we add ruleset and rules to our XML configuration file as:
- Code Style Ruleset, deprecated since 1.4 The rule is replaced by
ClassNamingConventions.
- Rule “BeanMembersShouldSerialize” from Error Prone ruleset with a priority of 2.
- Rule “UseLocaleWithCaseConversions” from Error Prone ruleset.
- Rule “CommentRequired” from Documentation ruleset with these properties set to “Ignored”:
  1. classCommentRequirement
  2. headerCommentRequirement
  3. fieldCommentRequirement

Then we generate a report and correct any errors/warnings.

## Members
- Claudia Sofía Asanza Romero 
- Carlos Humberto Meneses Murillo 
- Yiam Oswaldo Rodríguez Delgado 
- Luis Alfredo Rodríguez Chávez 
- Joel Alejandro Alvarado Jiménez 
- Miguel Angel Licea Cespedes 
