# S3-DBO2-Portfolio

![test](https://media.giphy.com/media/Dh5q0sShxgp13DwrvG/giphy.gif)

## Table of contents
[1: Web application](#1-web-application)</br>
[2: Software quality](#2-software-quality)</br>
[3: Agile method](#3-agile-method)</br>
[4: CI/CD](#4-ci-cd)</br>
[5: Cultural differences and ethics](#5-cultural-differences-and-ethics)</br>
[6: Requirements and design](#6-requirements-and-design)</br>
[7: Business processes](#7-business-processes)</br>
[8: Professional](#8-professional)</br>
 

 
-
 


## 1: Web application
```
User friendly: 
You apply best practices when creating user interfaces and basic user experience testing and development techniques.

Full-stack: 
You design and build a full stack application using a commonly accepted front end Javascript framework and back end
application implementing relevant communication protocols, persistence of data by usage of ORM and addressing asynchronous 
communication issues.
```

<details>
  <summary>What are some practices in creating user interfaces? </summary>
</br>

Before I can even decide how I'm going to implement "the best practices" I need to research and understand which user interface design basics are used when making a front-end.

When researching I learned that's important to know what the goal of the user is before even designing anything. After establishing the goal it's important to keep the design simple, it's important for the user to understand the purpose of the app. Little animations in the buttons the keep the user engaged and give feedback is also important. 

So to sum it up:
+ Know the goal of the user
+ Create an easy-to-navigate interface / simple design 
+ Changes in state and helpful information by animations

There are a lot more practices in creating a good UI design but in my case I will focus on those 3 points 

[Best Practices for Designing an Interface](https://www.usability.gov/what-and-why/user-interface-design.html)</br>
[The 4 Golden Rules of UI Design](https://xd.adobe.com/ideas/process/ui-design/4-golden-rules-ui-design/)</br>
[Design Consistency Guide UI and UX Best Practices](https://www.uxpin.com/studio/blog/guide-design-consistency-best-practices-ui-ux-designers/#h-1-start-with-user-research)
</br>

 </details>
 <details>
<summary>What is the goal of the user? </summary>
</br>
In my case it's an easy way to access different streaming platforms with little information about the show or movie they are watching. It's important for the user to quickly and easily understand the purpose of the app in a single glance. 

</details>
 <details> 
 <summary>Examples of other designs</summary>
</br>
When researching I though it would be smart to first examine how the streaming services show the user where they left of before even searching for designs from other people online. </br></br>

Firsly I looked at Plex:
![image](https://user-images.githubusercontent.com/60787548/195307580-87997667-faa1-4dfb-b0b8-3fc82df30712.png)</br>
Plex uses the poster on the right with the title and a little description on the left. They show the rating and three simple buttons which get a different color when hovering over it to indicate that it will perform an action when clicking on it.</br>

Secondly I looked at Netflix:</br>
![image](https://user-images.githubusercontent.com/60787548/195308852-0e8bf976-9e67-4d30-9b6d-9814f458ca47.png)</br>
As you can see, they have almost the same design as Plex with the image on the right and a title and description on the left. With two simple buttons which change color when hovering over it to indicate it's a button with an action. </br>

To make it easier for user to understand my app I will also base my design on these two designs. </br> </br>
Now let's look at some different designs created by designers online. </br>
![image](https://user-images.githubusercontent.com/60787548/195311419-54d2c048-15e8-471e-9b68-e612d12b7909.png)
If we look at this design created by [CMARIX TechnoLabs](https://www.cmarix.com/) we can also see the title on the left but this design has the image more centered, and again the simple buttons.

![image](https://user-images.githubusercontent.com/60787548/195312662-104bfd17-f3c9-43fc-9c51-a3ffefb70660.png)
Created by: [aPurple](https://www.apurple.co/)

</details>

 <details> 
 <summary>My design</summary>
</br>
Based on the 3 practices and the other streaming service examples I can up with the following design:</br></br>
I have decided to put the image right and the title and description left, for each different streaming service it will show where they left off (if the login and api data is available)</br>
<a href='https://postimg.cc/xXyWymkg' target='_blank'><img src='https://i.postimg.cc/7Zpw4Mqv/Hub-Design-1.png' border='0' alt='Hub-Design-1'/></a>
</br>
I also have an alternative design where the colors of the background are dynamic and change with the colors of the poster</br>
<a href='https://postimg.cc/rz13LWjT' target='_blank'><img src='https://i.postimg.cc/jqmbP4JD/Hub-2.png' border='0' alt='Hub-2'/></a>
</details>


 <details>
<summary>What front-end am I going to use in my project? </summary>
</br>
When looking into front-end frameworks / technologies I was hesitating between 3 options:
<ul>
<li>C#</li>
<li>React.js</li>
<li>Angular</li>
</ul>

Because I already worked with C# for most of my previous year and previous school I decided to try something new. Choosing between React and Angular was difficult because a lot of sources online seemed biased towards one or the other, so I decided to look at the <a href="https://survey.stackoverflow.co/2022/#most-loved-dreaded-and-wanted-webframe-want">Stackoverflow survey</a> to help me make a decision. Where I came along this quote: 
> "Angular.js is in its third year as the most dreaded. React.js completes its fifth year as most wanted." 

So I decided to go with React.js as my front-end to get the basic project going but when I have time I'm going look into Angular to experience "the hatred" for myself.
</details>

<details>
<summary>What backend am I going to use in my project? </summary>
</br>
I'm not going to lie, when looking into backend languages I have looked into a few but ended up choosing the same language as my group-project, which is: <b>Springboot</b>. I chose this to make my life a little easier and just to make sure I can use my knowledge in both projects.
</details>



## 2: Software quality
```
Tooling and methodology: 
Carry out, monitor and report on unit integration, regression and system tests, with attention for security and
performance aspects, as well as applying static code analysis and code reviews.
```

## 3: Agile method
```
Choose: 
You are aware of the most popular agile methods and their underlying agile principles. 
Your choice of a method is motivated and based on well-defined selection criteria and context analyses.
```
<details> 
 <summary>Which different Agile methods are there?</summary>
</br>

There are 5 different mainly used Agile methods: 
+ Scrum
+ Lean
+ Kanban
+ XP (Extreme Programming)
+ Crystal

<h3>Scrum</h3>
When using scrum you work in sprints, those are cycles in the development. You start with a startup to discuss what is the plan is for the day. When using scrum it focuses more on quality resulting in less mistakes. When you get a daily assignment it's more motivating when you finish the task for a day. The disadvantage of using scrum is losing track of the whole process of the project and team members not knowing their role in the project. </br>

<h3>Lean</h3>
Lean is created by Toyota, it works with 5 principles:
<ul>
<li>Value - Knowing and understanding what the customer is willing to pay for.</li>
<li>Value stream mapping - mapping the sequence the product goes through in the company.</li>
<li>Flow - Making sure the information runs smoothly without delay.</li>
<li>Pull - Replacing materials that are actually used and eleminating uneunnecessary elements.</li>
<li>Perfection - Striving the eleminate waste and to improve the value for the customer. </li>
</ul>
Lean is very customer focused, all customers wishes are defined as value. Activity that is non-value add(so not really useful for the customer) is defined as waste. And because we don't want more waste in the world we have to reduce that. 

<h3>Kanban</h3>
Kanban is a workflow management method created in Japan, the word 'Kanban' means 'visualboard' or 'sign'. This method is organised on a board and divided into columns showing the flow within the software production. Because Kanban doesn't really use timeframes (like sprints with scrum), there is a posibility that time problems will develop. Kanban is one of the easiest to use outside of an IT related project. 

<h3>Extreme Programming</h3>
XP, or Extreme Programming is created to improve software quality. When working with the XP method you release in short development cycles, this way you improve productivity and introduce more checkpoints to adopt new customer wishes. With XP you don't program features untill they are actually needed, expecting changes in customers requirements along the way. Code reviews are viewed as a beneficial practice and code will be reviewed continuously. 

<h3>Crystal</h3>
From these 5 Agile methods, Crystal can be seen as the most flexible methods. It is mainly used for short-term projects by a team working from the same workspace. With Crystal teams can work the way they think is most effective. By just going with the flow the team can easily adapt to requirement changes. Crystal emphasizes team collaboration and de-emphasizing documentation and reporting, this can lead to confusion in the code and less visibility  into the teams progress.
</br>
</br>
<a href="https://www.xpand-it.com/blog/top-5-agile-methodologies/">Top 5 main Agile methodologies: advantages and disadvantages</a></br>
<a href="https://leanmethods.com/resources/articles/what-is-lean/">What Is Lean?</a></br>
<a href="https://kanbanize.com/kanban-resources/getting-started/what-is-kanban">What Is Kanban?</a></br>
<a href="https://en.wikipedia.org/wiki/Extreme_programming">Extreme programming</a></br>
<a href="https://www.productplan.com/glossary/crystal-agile-framework/">Crystal Agile Framework</a></br>






</details>
</br>
<details> 
 <summary>What Agile method will I use and why?</summary></br>
 I first looked at Scrum, the way I see it it would work best in a groupsproject instead of an indivual project. So I have decided to work in the Crystal method cause that seemed like the most flexible option because I'm still figuring out what functionalities my project will consists of and because it's a short-term project. 
</br>

</details>

## 4: CI-CD
```
Design and implement: 
You design a release process and implement a continuous integration and deployment solution 
(using e.g. Gitlab CI and Docker).
```

## 5: Cultural differences and ethics
```
Recognize: 
Recognition is based on theoretically substantiated awareness of cultural differences and ethical 
aspects in software engineering.

Take into account: 
Adapt your communication, working, and behavior styles to reflect project stakeholders 
from different cultures; Address one of the standard Programming Ethical Guidelines 
(e.g., ACM Code of Ethics and Professional Conduct) in your work.  
```
</br>
<details> 
 <summary>Which cultural differences are there in the programming?</summary>
</br>
While researching for some cultural differences I didn't find much, when reading a few post from developers working abroad or with different international teams they said that for the most part there are no differences only a language barrier and communication problems.
</br>
</br>
 <a href="https://www.quora.com/What-are-some-cultural-differences-between-programmers-around-the-world-which-affect-their-programs">What are some cultural differences between programmers around the world</a></br>
 
 

</br>

</details>

<details> 
 <summary>What cultural ethics are there in programming?</summary>
 </br>
 
 There are a few ethics to keep in mind while programming. Here are the 8 principles:</br>
 <ul>

<li>Public - "Software engineers shall act consistently with the public interest."</li>
<li>Client and employer - "Software engineers shall act in a manner that is in the best interests of their client and employer consistent with the public interest.</li>
<li>Product - "Software engineers shall ensure that their products and related modifications meet the highest professional standards possible."</li>
<li>Judgement - "Software engineers shall maintain integrity and independence in their professional judgment."</li>
<li>Management -  "Software engineering managers and leaders shall subscribe to and promote an ethical approach to the management of software development and maintenance." </li>
<li>Profession - "Software engineers shall advance the integrity and reputation of the profession consistent with the public interest." </li>
<li>Colleagues - "Software engineers shall be fair to and supportive of their colleagues." </li>
<li>Self - "Software engineers shall participate in lifelong learning regarding the practice of their profession and shall promote an ethical approach to the practice of the profession." </li>
</ul>
 
  </br>
  </br>
 <a href="https://ethics.acm.org/code-of-ethics/software-engineering-code/">The Software Engineering Code of Ethics and Professional Practice</a></br>

</br>

</details>

## 6: Requirements and design
```
Multiple types of test techniques: 
You apply user acceptance testing and stakeholder feedback to validate the quality of the requirements. 
You evaluate the quality of the design (e.g., by testing or prototyping)
taking into account the formulated quality properties like security and performance.
```
## 7: Business processes
```
Simple: 
Involving stakeholders, predominantly sequential processes with one or two alternative paths.

Related: 
Business processes during which the software that you are developing will be used (business processes that the software must
support by fully or partially automating them). Or business processes needed for the success of your software development project 
(e.g., product release, market release, financial assurance).
```

## 8: Professional
```
Professional manner: 
You develop software as a team effort according to a prescribed software methodology and following team agreements. 
You are able to track your work progress and communicate your progress with the team.

You actively ask and apply feedback from stakeholders and advise them on the most optimal technical and
design (architectural) solutions. You choose and substantiate solutions for a given problem.
```
