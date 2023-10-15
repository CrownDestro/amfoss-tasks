const Discord = require('discord.js');
const client = new Discord.Client();
const request = require('request');
const cheerio = require('cheerio');

client.on('ready', () => {
    console.log(`Logged in as ${client.user.tag}!`);
});

client.on('message', msg => {
    if (msg.content === '!score') {
        request('https://www.espncricinfo.com/live-cricket-score', (error, response, body) => {
            if (!error && response.statusCode == 200) {
                console.log("Command received: !score");
                const $ = cheerio.load(body);
                const scoreDiv = $('div.match-info.match-info-MATCH.live');
                const matchTitle = scoreDiv.find('span.description').text().trim();
                const score = scoreDiv.find('div.score').text().trim();

                msg.channel.send(`**${matchTitle}**\n${score}`);
            } else {
                msg.channel.send('Unable to fetch live cricket score at the moment.');
            }
        });
    }
});

client.login('MTE1OTY3ODU3MTI5NjYwODI3Ng.GC2FbE.w0NoolWiYUYAa3VeDnFwYE95qMb4vESsv3LCg0');