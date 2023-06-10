<html>
    <head>
        <title>ADMIN :: CREATE JOB</title>
    </head>
    <body>
        <form action="/admin/post-job" method="post">
            <input type="text" name="job_title"><br>
            <select name="job_category">
                <option value="full_time">Full Time</option>
                <option value="part_time">Full Time</option>
                <option value="contract">Contract</option>
                <option value="internship">Internship</option>
            </select><br>
            <input type="text" name="job_role"><br>
            <input type="text" name="job_salary"><br>
            <input type="text" name="job_location"><br>
            <input type="text" name="job_skills"><br>
            <input type="text" name="job_experience"><br>
            <input type="text" name="job_lastdate"><br>
            <input type="submit">
        </form>
    </body>
</html>